package edu.it.repository;

import edu.it.model.Cliente;

public class GrabadorCondicional implements GrabadorCliente {
	private GrabadorClienteSQL grabadorClienteSQL;
	private GrabadorClienteJSON grabadorClienteJSON;
	
	public GrabadorCondicional(GrabadorClienteSQL grabadorClienteSQL, GrabadorClienteJSON grabadorClienteJSON) {
		this.grabadorClienteSQL = grabadorClienteSQL;
		this.grabadorClienteJSON = grabadorClienteJSON;
	}

	public void grabarCliente(Cliente cli) {
		try {
			grabadorClienteSQL.grabarCliente(cli);
			return;
		}
		catch (Exception ex) {
			grabadorClienteJSON.grabarCliente(cli);
		}
	}
}
