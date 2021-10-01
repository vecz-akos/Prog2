class BasicExercises02 extends BasicExercises02Methods {
	public static void main(String[] args) {

		// exercise 01
		printIfFindABC("Csaba");

		// exercise 02
		System.out.println();
		int[] numArr = { 42, 42, 1024, 64, 2 };
		System.out.println("Max number in array: " + findMaxInArray(numArr));

		// exercise 03
		System.out.println();
		System.out.println(reverseInt(12345));

		// exercise 04
		System.out.println();
		System.out.println(calc('*', 3, 4));
		System.out.println(calc('@', 3, 4));

		// exercise 05
		System.out.println();
		System.out.println(replaceStrWithX("1234567890"));

	}
}