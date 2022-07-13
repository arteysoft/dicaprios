package edu.it;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");

        ActorUno uno = new ActorUno();
        ActorDos dos = new ActorDos();
        
        uno.setActor(dos);
        dos.setActor(uno);
        
        uno.encolarMensaje("Hola Amigos");
    }
}
