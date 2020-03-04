package week1.day1;

public class PrimeNumberFrom1To100 {

	public static void main(String[] args) {

		PrimeNumberFrom1To100 c = new PrimeNumberFrom1To100();
		c.checkPrime(100);

	}

	public void checkPrime(int limit) {

		String primeNumbers = "";
		for (int i = 2; i <= limit; i++) {
			boolean isPrime = calculation(i);
			if (isPrime)
				primeNumbers = primeNumbers + i + " ";
		}

		System.out.println("Prime numbers from 1 to 100 are:");
		System.out.println(primeNumbers);
	}

	boolean calculation(int numberToBeChecked) {
		int remainder;
		for (int j = 2; j <= numberToBeChecked / 2; j++) {
			remainder = numberToBeChecked % j;

			if (remainder == 0)
				return false;
		}
		return true;
	}
}
