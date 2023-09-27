package javaPracticeForInterview;

public class MaxArray {

	public static void main(String[] args) {

		int a[] = new int[4];
		a[0] = 20;
		a[1] = 70;
		a[2] = 40;
		a[3] = 20;

		int max;
		int min;
		max = a[0];
		min = a[1];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			}

			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Max number is : " + max);
		System.out.println("Max number is : " + min);
	}
}
