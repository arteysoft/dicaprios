package edu.it.robotCCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConsultaCotizacionLocal implements IState {
	public IState execute() {
		WebDriver webDriver = null;
		try {
			webDriver = new ChromeDriver();
			webDriver.get("https://www.invertironline.com/titulo/cotizacion/BCBA/YPFD/YPF/");
			WebElement elemento = webDriver.findElement(By.id("IdTitulo"));
			String contenido = elemento.getText();
			System.out.println("------------------------------------------");
			System.out.println(contenido);
			System.out.println("------------------------------------------");
			webDriver.close();
			String parseable = contenido
                    .replace("$ ", "")
                    .replace(",", ".");
			
			EstadoDTO.local = Double.valueOf(parseable);
			
			return new ConsultaCotizacionExterior();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return new EstadoInicial();
	}

}
