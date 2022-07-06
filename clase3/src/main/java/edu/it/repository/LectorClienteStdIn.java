package edu.it.repository;

import java.util.Scanner;
import java.util.UUID;

import edu.it.model.Cliente;

public class LectorClienteStdIn implements LectorCliente {
	public Cliente lectorCliente() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = scn.nextLine();
		System.out.print("Ingrese marca modelo: ");
		String marcaModelo = scn.nextLine();
		
		return new Cliente(
				UUID.randomUUID().toString(),
				nombre,
				marcaModelo
				);
	}
}
