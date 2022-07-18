package edu.it;

import java.util.UUID;

import com.google.gson.Gson;

public class GestorMulta extends Actor {
	protected void onNewMessage(String datosDelClimaMasVehiculo) {
		// Armar la estructura de datos Ticket y va a enviar
		// dos mensajes
		// var ticket = new Ticket(datos del clima, datos del vehiculo)
		
		System.out.println("edu.it.gestormulta");
		
		var climaVehiculo = new Gson().fromJson(
				datosDelClimaMasVehiculo, ClimaVehiculo.class);
		
		Ticket t = new Ticket();
		t.id = UUID.randomUUID().toString();
		t.patente = climaVehiculo.datosVehiculo.patente;
		t.tipoVehiculo = climaVehiculo.datosVehiculo.tipoVehiculo.name();
		t.velocidadMedida = climaVehiculo.datosVehiculo.velocidadMedida;
		t.tipoClima = climaVehiculo.tipoClima.name();
		t.limitePermitido = 10000;
		
		var tktJson = new Gson().toJson(t);
		
		this.broker.enviarMensaje(new Mensaje("edu.it.grabadorsql", tktJson));
		this.broker.enviarMensaje(new Mensaje("edu.it.grabadorjson", tktJson));
		this.broker.enviarMensaje(new Mensaje("edu.it.grabadortracer", tktJson));
	}
}
