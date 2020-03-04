package week1.day2;

public class PrintOnlyLowerCase {
	
	public static void main(String[] args) {
		String input = "AmaZon";
		String output;
		output = input.replaceAll("[A-Z]", ""); /*[A-Z] is regex for UpperCase letters*/
		System.out.println("The charcters with lowercases are "+ output);
	}

}