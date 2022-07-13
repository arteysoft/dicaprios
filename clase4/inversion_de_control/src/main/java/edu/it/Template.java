package edu.it;

public abstract class Template {
	public void probarProducto() {
		try {
			testUnitario();
			testQA();
			testStress();
		}
		catch (Exception ex) {
			System.out.println("Fallo en la prueba, hay que iterar nuevamente");
		}
	} 
	protected abstract void testUnitario();
	protected abstract void testQA();
	protected abstract void testStress();
}
