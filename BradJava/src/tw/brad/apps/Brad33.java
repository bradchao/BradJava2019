package tw.brad.apps;

public class Brad33 {
	public static void main(String[] args) {
	}
}
abstract class Poly {
	double calLength() {
		return 1.0;
	}
	abstract double calArea();
}
class Triangle extends Poly {
	double calArea() {
		return 2.0;
	}
}
class Rectangle extends Poly {
	double calArea() {
		return 3.0;
	}
}