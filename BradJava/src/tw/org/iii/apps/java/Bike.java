package tw.org.iii.apps.java;

public class Bike {
	protected double speed;
	protected int color;	// 0: no color
	
	public Bike() {
		// super();
		System.out.println("Bike()");
		color = 1;
	}
	public Bike(int color) {
		// super();
		System.out.println("Bike(int)");
		if (color>0) this.color = color;
		else this.color = 1;
	}
	
	public void setColor(int color) {
		if (color>0) {
			this.color = color;
		}
	}
	public int getColor() {
		return color;
	}
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed*0.7;
	}
	
	public double getSpeed(){
		return speed;
	}
}
