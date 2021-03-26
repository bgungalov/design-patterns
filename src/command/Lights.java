package command;

public class Lights {

	private Boolean lightsOn;
	
	public void switchOn() {
		System.out.println("Exercises are on");
		this.lightsOn = true;
	}
	
	public void switchOff() {
		System.out.println("Exercises are off");
		this.lightsOn = false;
	}
}
