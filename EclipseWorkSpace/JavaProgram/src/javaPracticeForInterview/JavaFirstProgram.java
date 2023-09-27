package javaPracticeForInterview;

public class JavaFirstProgram {

	public static void main(String[] args) {
		int a[] = { 100, 20, 30, 10, 30, 50, 40 };

		int max = a[0];
		int min = a[1];
		// for (int i = 0; i<a.length; i++)
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
//		System.out.println(a.length);
//		System.out.println(a[0]);
//		System.out.println(a[1]);
		System.out.println("Maximum no is " + max);
		System.out.println("Minimum no is " + min);
	}

}
