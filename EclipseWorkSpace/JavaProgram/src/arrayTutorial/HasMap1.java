package arrayTutorial;

import java.util.HashMap;

public class HasMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(23, "Ram");
		hm.put(24, "Ram1");
		hm.put(25, "Ram2");
		hm.put(26, "Ram3");
		hm.put(27, "Ram4");
		hm.put(27, "Ram5");
		hm.put(28, "Ram5");
		System.out.println(hm);
		System.out.println(hm.size());
	}
}
