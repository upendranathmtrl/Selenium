package week1.day2;

public class ReverseOfString {
	public static void main(String[] args) {
		String input = "upendranath";
		char[] charArray = input.toCharArray();
		int length = input.length();
		System.out.println("The reverse	of the string is ");
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
