package edu.it;

import java.util.ArrayList;
import java.util.List;

public abstract class Actor extends Thread {
    protected List<String> elementosPendeintes;
    protected Broker broker = new NullObjectBroker();

    public Actor() {
        elementosPendeintes = new ArrayList<String>();
        this.start();
    }
    public int obtenerCantMensajesEncolados() {
        int x = 0;
        synchronized(elementosPendeintes) {
            x = elementosPendeintes.size();
        }
        return x;
    }
    public void encolarMensaje(String t) {
        synchronized(elementosPendeintes) {
            elementosPendeintes.add(t);
            elementosPendeintes.notify();
        }
    }
    public void run() {
        System.out.println("Levantando actor... ");
        for (;;) {
            try {
                for (;;) {
                    String t = null;
                    synchronized(elementosPendeintes) {
                        elementosPendeintes.wait(100);
                        if (elementosPendeintes.size() > 0) {
                            t = elementosPendeintes.remove(0);
                        }
                    }
                    if (t != null) {
                        onNewMessage(t);
                    }
                }
            }
            catch (Exception ex) {
                System.out.println("Error en Actor");
                System.out.println(ex.getMessage());
            }
        }
    }
    public void setBroker(Broker broker) {
		this.broker = broker;
	}
    protected abstract void onNewMessage(String t);
}

