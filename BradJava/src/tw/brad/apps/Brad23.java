package tw.brad.apps;

import tw.org.iii.apps.tools.Brad;

public class Brad23 {

	public static void main(String[] args) {
		String s1 = new String();
		
		byte[] b1 = {97,98,99,100,101,102,103};
		String s2 = new String(b1);
		System.out.println(s1);
		System.out.println(s2);
		String s3 = new String(b1, 2, 4);
		System.out.println(s3);
		System.out.println("-----");
		String a1 = new String(b1);	// "abcdefg"
		String a2 = new String(b1);	// "abcdefg"
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		Brad brad1 = new Brad();
		Brad brad2 = new Brad();
		System.out.println(brad1 == brad2);
		System.out.println(brad1.equals(brad2));
		System.out.println("----");
		String a3 = "abcdefg";
		String a4 = "abcdefg";
		System.out.println(a3 == a4);
		System.out.println(a3.charAt(3));
		System.out.println(a3.substring(2, 6));
		System.out.println(a3);
		System.out.println("hamburger".substring(4, 8) );
		System.out.println("------");
		String a5 = "Brad";
		String a6 = a5;
		System.out.println(a5 == a6);
		a5 = "Peter";
		System.out.println(a5 == a6);
		System.out.println(a5.concat("Brad"));
		System.out.println(a5);
		
		
		
		
		
		
		
		
	}

}
