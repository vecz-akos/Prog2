public class BasicExercises02Methods {
	public static void printIfFindABC(String str) {
		for (char ch : str.toCharArray()) {
			switch (ch) {
				case 'a':
				case 'A':
					System.out.println("a found");
					break;
				case 'b':
				case 'B':
					System.out.println("b found");
					break;
				case 'c':
				case 'C':
					System.out.println("c found");
					break;
				default:
					System.out.println(ch);
			}
		}
	}

	public static Integer findMaxInArray(int[] arr) {
		if (arr.length == 0)
			return null;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int reverseInt(int num) {
		String numStr = String.valueOf(num);
		StringBuilder reversedStr = new StringBuilder();
		reversedStr.append(numStr);
		reversedStr.reverse();
		int returnValue = Integer.valueOf(new String(reversedStr));
		return returnValue;
	}

	public static Integer calc(char operation, int numA, int numB) {
		switch (operation) {
			case '+':
				return numA + numB;
			case '-':
				return numA - numB;
			case '*':
				return numA * numB;
			case '/':
				return numA / numB;
			default:
				return null;
		}
	}

	public static String replaceStrWithX(String str) {
		String returnStr = "";
		for (int i = 1; i <= str.length(); i++) {
			if (i % 5 == 0)
				returnStr += 'X';
			else if (i % 2 == 0)
				returnStr += 'x';
			else
				returnStr += str.charAt(i - 1);
		}
		return returnStr;
	}
}
