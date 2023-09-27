package javaPracticeForInterview;

public class CharCounteInString {

	public static void main(String[] args) {

		String str = "The Hindustan Times";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(str.length());
		System.out.println("Count of the characther in string is " + count);
	}
}
