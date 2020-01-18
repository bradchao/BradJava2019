package tw.brad.apps;

import java.util.HashMap;

public class Brad71 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("name", "Brad");
		map.put("gender", true);
		map.put("age", 18);
		map.put("name", "Nancy");
		System.out.println(map.get("name"));
		System.out.println(map.get("gender"));
		System.out.println(map.get("age"));
	}

}
