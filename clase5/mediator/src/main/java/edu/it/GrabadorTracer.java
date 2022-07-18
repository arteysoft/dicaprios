package edu.it;

public class GrabadorTracer extends Actor {

	@Override
	protected void onNewMessage(String t) {
		System.out.println("grabadortracer");
		System.out.println(t);
		System.out.println("............................");
	}
}
