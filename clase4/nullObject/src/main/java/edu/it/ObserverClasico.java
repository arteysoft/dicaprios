package edu.it;

public class ObserverClasico implements Observer {
	@Override
	public void notify(String s) {
		System.out.println(s);
	}
}
