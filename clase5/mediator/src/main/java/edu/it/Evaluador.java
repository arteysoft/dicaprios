package edu.it;

import com.google.gson.Gson;

public class Evaluador extends Actor {

	@Override
	protected void onNewMessage(String datosDelClimaMasVehiculo) {
		
		// Este actor, se encarga de verificar que al vehciulo si es
		// que supera e limite de velocidad, debe enviar un mensaje
		// gestionar multa
		
		var climaVehiculo = new Gson().fromJson(
				datosDelClimaMasVehiculo, ClimaVehiculo.class);
		
		System.out.println("Aca meter mano...");
		System.out.println(new Gson().toJson(climaVehiculo.tipoClima));
    	System.out.println(new Gson().toJson(climaVehiculo.datosVehiculo));
		
    	// Quiero que mensajeen al gestor multa solo si supero el limite
    	// de velocidad
    	
		this.broker.enviarMensaje(new Mensaje("edu.it.gestormulta", 
					new Gson().toJson(climaVehiculo)));	
	}
}
