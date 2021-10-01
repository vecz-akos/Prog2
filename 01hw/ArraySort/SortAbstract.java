package ArraySort;

abstract class SortAbstract implements SortInterface {

	public static void sort(int[] arr) {
	};

	public static void print(int[] arr) {
		System.out.print("{ ");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1] + " }");
	}

	public static void swap(int[] arr, int indexA, int indexB) {
		int swap = arr[indexA];
		arr[indexA] = arr[indexB];
		arr[indexB] = swap;
	}
}
