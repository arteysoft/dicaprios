package edu.it.entities;

import javax.persistence.*;

@Entity
public class Cliente {
	@Id
	public String id;
	public String nombre;
	public String auto;
	
	public Cliente(edu.it.model.Cliente cliente) {
		id = cliente.id;
		nombre = cliente.nombre;
		auto = cliente.auto;
	}
	public Cliente() {}
}
