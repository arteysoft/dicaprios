package edu.it;

import com.google.gson.Gson;

public class SensorPermanente extends Actor {
	protected void onNewMessage(String t) {
		var sensorClima = new com.bolivarsoft.sensorclima.SensorClima();
		var datosClima = sensorClima.sensar();
		
		for (;;) {	
        	var sensorVelocidad = new com.bolivarsoft.sensorvelocidad.SensorVelocidad();    	
        	var datosVehiculo = sensorVelocidad.sensarVehiculo();
        	
        	var climaVehiculo = new ClimaVehiculo(
        				datosClima,
        				datosVehiculo 
        			);
        	
        	broker.enviarMensaje(
        			new Mensaje("edu.it.evaluador",
        					new Gson().toJson(climaVehiculo)));
        }
	}
}
