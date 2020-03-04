package week1.day1;

public class Fibonnaci {

	public static void main(String[] args) {
		
		Fibonnaci f = new Fibonnaci();
		f.findFibonnaci(20);
	}
	
	public void findFibonnaci(int limit) {
		int  fibonnaciIs [] = new int[limit] ;
		for(int i=0; i<limit; i++) {
			
			if(i==0)
				fibonnaciIs[i] = 0;
			else if(i==1)
				fibonnaciIs[i]= 1;
			else 
				fibonnaciIs[i] = fibonnaciIs[i-2] + fibonnaciIs[i-1];
		}
		
		System.out.println("The fibonnaci series for the limit " + limit + "is");
		for(int i=0; i<limit; i++) {
			System.out.println(fibonnaciIs[i]);
		}
			
		}
	
}
