package week1.day2;

public class _3HA_ReverseEvenWords {
	public static void main(String[] args) {
		String input ="I am a software Tester";
		String reverseEvenWords= "";
		int count=1;
		String []split = input.split("\\s");
		for(String get : split) {
			StringBuilder strbuild = new StringBuilder(get);
			if((count%2)!=0) 
				strbuild.reverse();
			reverseEvenWords =reverseEvenWords +" "+strbuild.toString();
			count++;
			
		}
		System.out.println(reverseEvenWords);
	}

}
