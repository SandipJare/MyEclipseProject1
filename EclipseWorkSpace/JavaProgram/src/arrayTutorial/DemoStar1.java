package arrayTutorial;

public class DemoStar1 {

	public static void main(String[] args) {

		int i, j, row = 8;

		for (i = 0; i < row; i++) {

			for (j = 0; j <= i; j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
