public class BasicExercises01Methods {

	public static void printnumbersFrom0To100() {
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
	}

	public static void fizzAndBuzzFrom1To100() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
				if (i % 5 == 0)
					System.out.println("Buzz");
				else
					System.out.println();
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		int maxi = (int) Math.sqrt(num);
		for (int i = 2; i <= maxi; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void printIsPrime(int num) {
		if (isPrime(num))
			System.out.println(num + " is prime.");
		else
			System.out.println(num + " is not prime.");
	}

	public static void printFibo(int limit) {
		if (limit < 1)
			return;

		int number = 1;

		int[] fiboNums = new int[limit];
		int numCounter = 0;
		fiboNums[numCounter++] = number;

		while (number < limit) {
			fiboNums[numCounter] = number;
			number = fiboNums[numCounter - 1] + fiboNums[numCounter++];
		}
		for (int i = 0; i < numCounter; ++i) {
			System.out.println(fiboNums[i]);
		}
	}

	public static int getGCD(int numA, int numB) {
		int min = Math.min(numA, numB);
		int max = Math.max(numA, numB);
		int gcd = min;
		int divider = 0;

		while (min % gcd != 0 || max % gcd != 0) {
			++divider;
			gcd = min / divider;
		}
		return gcd;
	}

	public static boolean isPalindrome(String str) {
		if (str.length() == 0)
			return true;
		int middle = str.length() / 2;
		int maxIndex = str.length() - 1;

		for (int i = 0; i <= middle; i++)
			if (str.charAt(i) != str.charAt(maxIndex - i))
				return false;

		return true;
	}

	public static String returnWithAnACharAndTheNextThree(String str) {
		int count = 0;
		String returnStr = "";
		for (char ch : str.toCharArray()) {
			if (count > 0 || ch == 'a') {
				returnStr += ch;
				++count;
				if (count > 3)
					break;
			}
		}
		return returnStr;
	}
}
