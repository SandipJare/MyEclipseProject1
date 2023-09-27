package javaPracticeForInterview;

public class SumEvenOddInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 6, 7, 8, 9 };
		int sumodd = 0;
		int sumeven = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				sumeven = sumeven + a[i];

			} else {
				System.out.println(a[i]);
				sumodd = sumodd + a[i];
			}
		}
		System.out.println("Sum for even no>> " + sumeven);
		System.out.println("Sum for odd no>> " + sumodd);
	}

}
