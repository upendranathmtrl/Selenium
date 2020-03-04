package week1.day2;

public class _2HA_SumOfTheDigitsItself {
	public static void main(String[] args) {
		String input = "1546";
		int output=0;
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int no =Integer.parseInt(String.valueOf(charArray[i]));
			output += no;
			
			/*int no =Character.getNumericValue(charArray[i]); //Alternative method*/
		}
		System.out.println("The sum of the digits is "+ output);
			

	}

}
