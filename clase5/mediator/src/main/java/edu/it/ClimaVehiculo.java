package edu.it;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;

public class ClimaVehiculo {
	public TipoClima tipoClima;
	public DatosVehiculo datosVehiculo;
	
	public ClimaVehiculo(TipoClima tipoClima, DatosVehiculo datosVehiculo) {
		this.tipoClima = tipoClima;
		this.datosVehiculo = datosVehiculo;
	}
	public ClimaVehiculo() {
		
	}
}
