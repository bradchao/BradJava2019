package tw.org.iii.apps.tools;

import tw.org.iii.apps.java.Bike;

public class Scooter extends Bike {
	private int gear;
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.2*gear;
	}
	
	public void setGear(int newgear) {
		gear = newgear;
	}
}
