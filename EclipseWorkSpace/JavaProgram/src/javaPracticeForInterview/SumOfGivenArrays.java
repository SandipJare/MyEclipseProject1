package javaPracticeForInterview;

public class SumOfGivenArrays {

	public static void main(String[] args) {

//		int a[ ]={1,2,3,4,5,6,7,8,9,10}
//   Print sum of all values

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i = 0; i <= a.length; i++) {

//			if (i % 2 == 0) {

			sum = sum + i;
//			}

		}
		System.out.println("sum of all values " + sum);
	}
}
