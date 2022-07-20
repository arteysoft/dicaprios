package edu.it.robotCCL;

import java.util.Scanner;

public class Calculos implements IState {

	@Override
	public IState execute() {
		System.out.println("Realice los calculos pedidos");
		Double ccl = EstadoDTO.local / EstadoDTO.nuevaYork;
		System.out.println("Contado con liqui: " + ccl);
		return new EstadoInicial();
	}

}
