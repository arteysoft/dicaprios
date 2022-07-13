package edu.it;

import com.google.gson.Gson;

public class SensorPermanente extends Actor {
	protected void onNewMessage(String t) {
		for (;;) {
        	var sensorClima = new com.bolivarsoft.sensorclima.SensorClima();
        	var sensorVelocidad = new com.bolivarsoft.sensorvelocidad.SensorVelocidad();
        	
        	var datosClima = sensorClima.sensar();
        	var datosVehiculo = sensorVelocidad.sensarVehiculo();
        	
        	System.out.println(new Gson().toJson(datosClima));
        	System.out.println(new Gson().toJson(datosVehiculo));
        	
        	broker.enviarMensaje(
        			new Mensaje("alguien_que_dice_si_es_multa_o_no", 
        					new Gson().toJson(datosVehiculo)));
        }
	}
}
