package edu.it.repository;

import edu.it.components.ConectorJPA;
import edu.it.model.Cliente;

public class GrabadorClienteSQL implements GrabadorCliente {

	public void grabarCliente(Cliente cli) {
		var em = new ConectorJPA().getEntityManager();
		em.getTransaction().begin();
		em.merge(cli);
		em.getTransaction().commit();
	}

}
