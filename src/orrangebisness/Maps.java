package orrangebisness;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("A", new Integer(1));
		hm.put("B", new Integer(2));
		hm.put("C", new Integer(3));
		System.out.println(hm.get("B"));
	}

}
