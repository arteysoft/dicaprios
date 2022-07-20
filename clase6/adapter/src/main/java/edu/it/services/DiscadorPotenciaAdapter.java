package edu.it.services;

import dialerpluspro.DialerPro;
import dialerpluspro.InfoCall;
import dialerpluspro.User;
import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;

public class DiscadorPotenciaAdapter implements DiscadorAbstracto {
	private DialerPro dialerPro;
	
	public DiscadorPotenciaAdapter(DialerPro dialerPro) {
		this.dialerPro = dialerPro;
	}
	public DatosLlamada realizarLlamada(Usuario u) {
		// Hacer las adaptaciones para converir de usuario a User
		InfoCall infoCall = dialerPro.dial(new User());
		// Hacer las adaptaciones de InfoCall a DatosLlamada 
		return new DatosLlamada();
	}
	public void emitirMensaje(DatosLlamada datosLlamada) {
		// Hacer las adaptaciones de DatosLlamada a InfoCall
		dialerPro.playMessage(new InfoCall());	
	}
	public void cortar(DatosLlamada datosLlamada) {
		// Hacer las adaptaciones de DatosLlamada a InfoCall
		dialerPro.hangup(new InfoCall());
	}
}
