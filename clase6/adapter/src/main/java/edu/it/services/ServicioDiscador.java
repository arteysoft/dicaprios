package edu.it.services;

import static edu.it.Utiles.Util.dormir;

import java.util.Random;

import edu.it.model.Usuario;

public class ServicioDiscador {
	public void run() {
	
		DiscadorPotencia discador = new DiscadorPotencia();
	
		for (;;) {
			Integer x = new Random().nextInt(4);
			System.out.println(x+"");
			if (x == 0) {
				System.out.println("Si es 0 entonces NO realizar la llamada...");
				continue;
			}
			var datosLlamada = discador.realizarLlamada(new Usuario());
			int z = x;
			if (z == 1) {
				System.out.println("retrazar el llamado a emitir mensaje x q corresponde a la emrpes Arcor");
				dormir(5);
			}
			discador.emitirMensaje(datosLlamada);
			int f = x;
			if (f == 2) {
				System.out.println("Cortar 2 veces x que hay un bug");
				discador.cortar(datosLlamada);
			}
			discador.cortar(datosLlamada);
			System.out.println("");
		}
	}
}
