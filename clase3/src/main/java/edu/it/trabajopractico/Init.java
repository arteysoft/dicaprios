package edu.it.trabajopractico;

class _factory {
	public static _wrapper crearWrapper() {
		return new _wrapper(new _contadorImpl());
	}
	public static _contadorImpl crearContadorImpl() {
		return new _contadorImpl();
	}
	
}

interface _contador {
	void tick(int n);
}

class _wrapper implements _contador {
	private _contador _contador;
	
	public _wrapper(_contador _contador) {
		this._contador = _contador;
	}
	public void tick(int n) {
		System.out.println("");
		System.out.println("---------------");
		_contador.tick(n);
		System.out.println("---------------");
		System.out.println("");
	}
}

class _contadorImpl implements _contador {
	public void tick(int n) {
		System.out.println("Numero: " + n);
	}
}

class _logicaAlternativa {
	private _contadorImpl _contadorImpl;
	private _wrapper _wrapper;
	private _contador _contador;
	
	public _logicaAlternativa(_contadorImpl _contadorImpl, _wrapper _wrapper) {
		this._contadorImpl = _contadorImpl;
		this._wrapper = _wrapper;
	}
	public void run() {
		for (int x = 1;;x++) {
			if (x % 2 == 0) {
				_contador = _wrapper;
			} else {
				_contador = _contadorImpl;
			}
			_contador.tick(x);
		}
	}
}

public class Init {
	public static void run() {
		var logicaAlt = new _logicaAlternativa(_factory.crearContadorImpl(), 
				_factory.crearWrapper());
		
		logicaAlt.run();
	}
}
