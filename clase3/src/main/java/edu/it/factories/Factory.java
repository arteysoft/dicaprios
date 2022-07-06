package edu.it.factories;

import edu.it.repository.GrabadorCliente;
import edu.it.repository.GrabadorClienteJSON;
import edu.it.repository.GrabadorClienteSQL;
import edu.it.repository.GrabadorCondicional;
import edu.it.repository.LectorCliente;
import edu.it.repository.LectorClienteStdIn;

public class Factory {
	public static LectorCliente crearLectorCliente() {
		return new LectorClienteStdIn();
	}
	public static GrabadorCliente crearGrabadorCliente() {
		return new GrabadorCondicional(
					new GrabadorClienteSQL(),
					new GrabadorClienteJSON()
				);
	}
}
