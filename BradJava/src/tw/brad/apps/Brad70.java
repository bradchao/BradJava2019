package tw.brad.apps;

import java.util.LinkedList;

public class Brad70 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0,1);	// 0
		list.add(0,2);	// 1
		list.add(2,3);	// 2
		list.add(0,4);	// 3
		//System.out.println(list.size());
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println(list.get(1));
		System.out.println();
		for (int i=list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
	}

}
