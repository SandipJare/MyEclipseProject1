package javaPracticeForInterview;

public class PrintTheEvenSumInNumbers {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 100; i = i + 5) {

//			if (i % 5 == 0)

			sum = sum + i;

		}

		System.out.println(sum);

	}
}
