package edu.it;

public class WorkerClass {
	private Observer observer = new ObserverNull();
	
	public void setObserver(Observer observer) {
		this.observer = observer;
	}
	
	public void run() {
		for (int x=0;;x++) {
			if (x % 10000000 == 0) {
				observer.notify("voy por el registro numero: " + x);
			}
		}
	}
}
