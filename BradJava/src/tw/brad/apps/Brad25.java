package tw.brad.apps;

public class Brad25 {

	public static void main(String[] args) {
		String a = "948794A";
		
		if (a.matches("^[0-9]{" + a.length() + "}$")) {
			boolean isDup = false;
			for (int i=0; i<a.length()-1; i++) {
				char c = a.charAt(i);
				if (a.substring(i+1).indexOf(c) >= 0 ) {
					isDup = true;
					break;
				}
			}
			System.out.println(isDup?"XX2":"OK");
		}else {
			System.out.println("XX1");
		}
	}

}
