package arrayTutorial;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(20);
		a1.add(25);
		a1.add(30);
		a1.add(35);
		a1.add(40);
		a1.add(45);

		for (int x : a1) {
			System.out.println(x);
		}

	}
}
