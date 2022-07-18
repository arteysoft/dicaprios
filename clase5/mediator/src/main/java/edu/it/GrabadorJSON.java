package edu.it;

import java.io.File;

import com.google.gson.Gson;

public class GrabadorJSON extends Actor {
	protected void onNewMessage(String ticketJson) {
		String pathTicket = "/var/dicaprios/tickets/";
		
		var ticket = new Gson().fromJson(
				ticketJson, Ticket.class);
		
		var nombreArchivo = String.join("", pathTicket, ticket.id, ".json");
		var seqDatosJSON = ticketJson;
		
		try {
			File f = new File(nombreArchivo);
			org.apache.commons.io.FileUtils.write(f, seqDatosJSON , "UTF8");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
