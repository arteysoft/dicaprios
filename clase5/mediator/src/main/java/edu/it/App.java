package edu.it;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        Broker broker = new MemoryBroker();
        
        broker.suscribe(new Suscriptor("com.dicaprios.sensor", new SensorPermanente()));
        broker.suscribe(new Suscriptor("edu.it.evaluador", new Evaluador()));
        broker.suscribe(new Suscriptor("edu.it.gestormulta", new GestorMulta()));
        
        broker.suscribe(new Suscriptor("edu.it.grabadorsql", new GrabadorSQL()));
		broker.suscribe(new Suscriptor("edu.it.grabadorjson", new GrabadorJSON()));
		broker.suscribe(new Suscriptor("edu.it.grabadortracer", new GrabadorTracer()));
        
        broker.enviarMensaje(new Mensaje("com.dicaprios.sensor", "arranca..."));
    }
}
