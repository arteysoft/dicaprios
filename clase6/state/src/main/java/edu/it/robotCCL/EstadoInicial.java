package edu.it.robotCCL;

public class EstadoInicial implements IState {
	public IState execute() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\cursos\\dicaprios\\clase6\\state\\chromedriver.exe");
		
		System.out.println("Estado incial");
		
		return new ConsultaCotizacionLocal();
	}
	
}
