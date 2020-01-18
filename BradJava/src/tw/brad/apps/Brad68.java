package tw.brad.apps;

import java.util.HashSet;

import tw.org.iii.apps.java.Bike;

public class Brad68 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");
		set.add(123);	// int > auto-boxing => Integer Object
		set.add(new Bird());
		set.add(new Bike());
		set.add(new Bike());
		set.add(new String("Brad"));
		System.out.println(set.size());
	}

}
