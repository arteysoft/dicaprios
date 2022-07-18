package edu.it;

public interface Broker {
	void suscribe(Suscriptor sus);
	void enviarMensaje(Mensaje mensaje);
}
