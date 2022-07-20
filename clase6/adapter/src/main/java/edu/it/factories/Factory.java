package edu.it.factories;

import edu.it.services.DiscadorPotencia;
import edu.it.services.ServicioDiscador;

public class Factory {
	public static ServicioDiscador crearServicioDiscador() {
		return new ServicioDiscador(new DiscadorPotencia());
	}
}
