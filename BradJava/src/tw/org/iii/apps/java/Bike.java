package tw.org.iii.apps.java;

public class Bike {
	private double speed;
	
	void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.2;
	}
	
	void downSpeed() {
		speed = speed < 1 ? 0 : speed*0.7;
	}
	
	double getSpeed(){
		return speed;
	}
}
