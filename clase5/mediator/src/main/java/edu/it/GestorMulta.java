package edu.it;

public class GestorMulta extends Actor {
	protected void onNewMessage(String climaMasVehiculo) {
		// Armar la estructura de datos Ticket y va a enviar
		// dos mensajes
		// var ticket = new Ticket(datos del clima, datos del vehiculo)
		
		System.out.println("edu.it.gestormulta");
		
		this.broker.enviarMensaje(new Mensaje("edu.it.grabadorsQL", climaMasVehiculo));
		this.broker.enviarMensaje(new Mensaje("edu.it.grabadorjson", climaMasVehiculo));
		this.broker.enviarMensaje(new Mensaje("edu.it.grabadortracer", climaMasVehiculo));
	}
}
