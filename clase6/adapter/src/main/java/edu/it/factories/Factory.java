package edu.it.factories;

import dialerpluspro.DialerPro;
import edu.it.services.DiscadorPotenciaAdapter;
import edu.it.services.ServicioDiscador;

public class Factory {
	public static ServicioDiscador crearServicioDiscador() {
		// return new ServicioDiscador(new DiscadorPotencia());
		return new ServicioDiscador(
				new DiscadorPotenciaAdapter(new DialerPro())
				);
	}
}
