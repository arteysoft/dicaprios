package edu.it;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");

        var wc = new WorkerClass();
        wc.setObserver(new ObserverClasico());
        wc.run();
    }
}
