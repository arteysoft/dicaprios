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

class _wrapperHtml implements _contador {
	private _contador _contador;
	private String etiqueta;
	
	public _wrapperHtml(_contador _contador, String etiqueta) {
		this._contador = _contador;
		this.etiqueta = etiqueta;
	}
	public void tick(int n) {
		var stdOutAnt = new StringBuilder()
				.append("<")
				.append(etiqueta)
				.append(">")
				.toString();
		
		var stdOutDsp = new StringBuilder()
				.append("</")
				.append(etiqueta)
				.append(">")
				.toString();
				
				
		System.out.println(stdOutAnt);
		_contador.tick(n);
		System.out.println(stdOutDsp);
	}
}

class _logicaAlternativa {
	private _contador _contadorImpl;
	private _contador _wrapper;
	private _contador _contador;
	
	public _logicaAlternativa(_contador _contadorImpl, _contador _wrapper) {
		this._contadorImpl = _contadorImpl;
		this._wrapper = _wrapper;
	}
	public void run() {
		for (int x = 1; x < 1000;x++) {
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
		var logicaAlt = new _logicaAlternativa(
				new _wrapperHtml(new _contadorImpl(), "h1"), 
				new _wrapperHtml(new _contadorImpl(), "h5"));
		
		logicaAlt.run();
	}
}
