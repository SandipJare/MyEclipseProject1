package arrayTutorial;

import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {

//		String a = "dsajnui342d8de8!jckds3";

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = scan.nextLine();
		String characters = "";
		String digits = "";
		String special_characters = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				characters += ch;
			} else if (Character.isDigit(ch)) {
				digits += ch;
			} else {
				special_characters += ch;
			}
		}
		System.out.println("Sorted Characters: " + sort(characters));
		System.out.println("Sorted Digits: " + sort(digits));
		System.out.println("Sorted Special Characters: " + sort(special_characters));
	}

	public static String sort(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] > chars[j]) {
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		return new String(chars);
	}
}
