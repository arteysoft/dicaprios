package edu.it.robotCCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.it.utiles.Util;

public class Robotito {
	public void run() {
		IState estado = new EstadoInicial();
		for (;;) {
			estado = estado.execute();
			Util.dormir();
		}
	}
}
