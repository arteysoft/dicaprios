package edu.it;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        new edu.it.services.ServicioDiscador().run();
    }
}
