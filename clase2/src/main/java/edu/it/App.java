package edu.it;

import edu.it.factories.Factory;
import edu.it.repository.GrabadorCliente;
import edu.it.repository.GrabadorClienteJSON;
import edu.it.repository.LectorCliente;
import edu.it.repository.LectorClienteStdIn;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");

        // Falta un factory
        GrabadorCliente grabadorCli = Factory.crearGrabadorCliente();
        LectorCliente lectorCli = Factory.crearLectorCliente();
        
        grabadorCli.grabarCliente(
        		lectorCli.lectorCliente()
        );
    }
}
