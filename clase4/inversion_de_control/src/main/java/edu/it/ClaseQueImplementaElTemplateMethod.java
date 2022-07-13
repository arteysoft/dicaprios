package edu.it;

public class ClaseQueImplementaElTemplateMethod extends Template {

	@Override
	public void testUnitario() {
		System.out.println("mvn test");
	}

	@Override
	public void testQA() {
		System.out.println("Probar con postman");		
	}

	@Override
	public void testStress() {
		System.out.println("Probar con 1000 conexiones simultaneas");
	}

}
