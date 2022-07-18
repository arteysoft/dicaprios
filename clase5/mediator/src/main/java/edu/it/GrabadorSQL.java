package edu.it;

import com.google.gson.Gson;

public class GrabadorSQL extends Actor {

	@Override
	protected void onNewMessage(String ticketJson) {
		var em = new edu.it.components.ConectorJPA().getEntityManager();
		
		var ticket = new Gson().fromJson(
				ticketJson, Ticket.class);
		
		try {
			System.out.println("Grabando mariaDB ...");
			em.getTransaction().begin();
			em.persist(ticket);
			em.getTransaction().commit();
		}
		catch (Exception ex) {
			System.out.println("error: " + ex.getMessage());
		}
	}
}
