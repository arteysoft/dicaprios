package edu.it;

public class ActorDos extends Actor {
	private Actor actor;
	
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	protected void onNewMessage(String t) {
		System.out.println(t);
		try { Thread.sleep(3000); } catch (Exception ex) {}
		actor.encolarMensaje(t.concat("!"));
	}
}
