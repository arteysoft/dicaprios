package edu.it.explicacion;

import edu.it.robotCCL.IState;
import edu.it.utiles.Util;

class ST_INICIAL implements IState {
	public IState execute() {
		System.out.println("Estado inicial");
		return new ST_DESARROLLO();
	}
}

class ST_DESARROLLO implements IState {
	public IState execute() {
		System.out.println("Estado desarrollo");
		return new ST_CIERRE();
	}
}

class ST_CIERRE implements IState {
	public IState execute() {
		System.out.println("Estado cierre");
		return new ST_INICIAL();
	}
}

public class Ejemplo2 {
	public void run() {
		IState estado = new ST_INICIAL();
		for (;;) {
			estado = estado.execute();
			Util.dormir();
		}
	}
}
