package week1.day1;

public class SumOfOddNumbers {
	int sum;
 public static void main(String[] args) {
	SumOfOddNumbers S = new SumOfOddNumbers();
	S.sumOfNumbers(100);
}
 public void sumOfNumbers (int limit ) { 

	 
	 for(int i =0; i<=limit; i++){
	 if(i%2 ==0){}
	 else
	 sum = sum + i;
	 }
	 System.out.println("The sum of odd numbers upto " + limit +" is " + sum);
	 }
}
