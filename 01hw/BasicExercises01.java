class BasicExercises01 extends BasicExercises01Methods {
	public static void main(String[] args) {

		// exercise 01
		System.out.println("\nnumbers from 0 to 100:");
		printnumbersFrom0To100();

		// exercise 02
		System.out.println("\n\nFizz and buzz:");
		fizzAndBuzzFrom1To100();

		// exercise 03
		System.out.println();

		int minusFive = -5;
		int two = 2;
		int fifty = 50;
		int onehundredone = 101;

		printIsPrime(minusFive);
		printIsPrime(two);
		printIsPrime(fifty);
		printIsPrime(onehundredone);

		// exercise 04
		System.out.println("\nFibonacci numbers to " + fifty);
		printFibo(fifty);

		// exercise 05
		System.out.println();
		System.out.println("gcd(30, 30) is " + getGCD(30, 30));
		System.out.println("gcd(3, 6) is " + getGCD(3, 6));
		System.out.println("gcd(50, 15) is " + getGCD(50, 15));
		System.out.println("gcd(21, 20) is " + getGCD(21, 20));

		// exercise 06
		System.out.println();
		String palindrome = "indulagorogaludni";
		String notPalindrome = "asymmetric";

		if (isPalindrome(palindrome))
			System.out.println(palindrome + " is a palindrome.");
		else
			System.out.println(palindrome + " is not a palindrome.");

		if (isPalindrome(notPalindrome))
			System.out.println(notPalindrome + " is a palindrome.");
		else
			System.out.println(notPalindrome + " is not a palindrome.");

		// exercise 07
		System.out.println();
		String notIncludeAnAChar = "eszperente";
		System.out.println(returnWithAnACharAndTheNextThree(palindrome));
		System.out.println(returnWithAnACharAndTheNextThree(notIncludeAnAChar));

	}
}