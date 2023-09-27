package javaPracticeForInterview;

public class ReverseString {

	public static void main(String[] args) {

		String p = "Hindustan";
		String rvrse = " ";
		int count = 0;
		// loop for iterate the string to print in reverse order
		for (int i = p.length() - 1; i >= 0; i--) {

			rvrse = rvrse + p.charAt(i);
		}
		System.out.println("Given string in reverse order is: " + rvrse);

//		System.out.println(p.length() - 1);

		// Loop for count the char in the string
		for (int i = 0; i < p.length(); i++) {

			if (p.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println("Character count in given String is: " + count);
	}
}
