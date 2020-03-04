package week1.day2; //Home Assignment

public class _1HA_OddIndexToUppercase {
	public static void main(String[] args) {
		String input = "changeme";
		char[] charArray = input.toCharArray();
		int length = charArray.length;
		
		for (int i = 0; i < length; i++) {
			if(i%2!=0) {
				char charAt = input.charAt(i);
				System.out.print(Character.toUpperCase(charAt));
			}
			else {
				System.out.print(charArray[i]);	
				
			}
		}
		
	}

}
