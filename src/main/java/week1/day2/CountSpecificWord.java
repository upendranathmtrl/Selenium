package week1.day2;

public class CountSpecificWord {
	public static void main(String[] args) {
		String toBeCompared ="India";
		String input ="amazon India development center has been established in year 2004 and has presence in 24 cities within India";
		int count=0;
		String[] splitWords = input.split(" ");
		
		int length = splitWords.length;
		
		for(int i=0; i<length; i++)
		if(toBeCompared.equals(splitWords[i])) {
			count++;
		}
		System.out.println("The word India is present at " + count +" places");
	}

}
