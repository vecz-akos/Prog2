package ArraySort;

public class BubbleSort extends SortAbstract {

	public static void sort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, i, j);
				}
			}
		}
	}
}
