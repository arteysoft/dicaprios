package edu.it.services;

import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;
import static edu.it.Utiles.Util.dormir;

public class DiscadorPotencia {
	public DatosLlamada realizarLlamada(Usuario u) {
		System.out.println("realizando la llamada ....");
		dormir(3);
		return new DatosLlamada();
	}

	public void emitirMensaje(DatosLlamada datosLlamada) {
		System.out.println("emitiendo mensaje de venta compulsiva ...");
		dormir(3);
	}

	public void cortar(DatosLlamada datosLlamada) {
		// TODO Auto-generated method stub
		System.out.println("Cortando la llamada ....");
		dormir(3);
	}
}
