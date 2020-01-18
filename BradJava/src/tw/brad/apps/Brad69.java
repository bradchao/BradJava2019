package tw.brad.apps;

import java.util.Iterator;
import java.util.TreeSet;

public class Brad69 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer temp = it.next();
			System.out.println(temp);
		}
		System.out.println("------");
		
		for (Integer it2: set) {
			System.out.println(it2);
		}
		
	}

}
