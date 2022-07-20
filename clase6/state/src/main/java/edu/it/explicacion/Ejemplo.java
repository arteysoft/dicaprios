package edu.it.explicacion;

import edu.it.utiles.Util;

public class Ejemplo {
	private final int ST_INICIAL = 11111;
	private final int ST_DESARROLLO = 33333;
	private final int ST_CIERRE = 55555;
	
	public void run() {
		int estado;
		
		estado = ST_INICIAL;
		
		for (;;) {
			switch (estado) {
			case ST_INICIAL:
				System.out.println("Estado inicial...");
				estado = ST_DESARROLLO;
				break;
			case ST_DESARROLLO:
				System.out.println("Estado desarrollo");
				estado = ST_CIERRE;
				break;
			case ST_CIERRE:
				System.out.println("Estado culminacion");
				estado = ST_DESARROLLO;
				break;
			}
			Util.dormir();
		}
	}
}
