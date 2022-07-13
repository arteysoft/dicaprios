package edu.it;

import java.util.HashMap;

public class MemoryBroker implements Broker {
	private HashMap<String, Actor> suscriptores = new HashMap<>();

	public void suscribe(Suscriptor sus) {
		suscriptores.put(sus.nombre, sus.actor);
		sus.actor.setBroker(this);
	}

	@Override
	public void enviarMensaje(Mensaje mensaje) {
		if (suscriptores.get(mensaje.destinatario) == null) {
			return;
		}
		suscriptores.get(mensaje.destinatario).encolarMensaje(mensaje.data);
	}
}
