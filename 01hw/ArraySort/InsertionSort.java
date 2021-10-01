package ArraySort;

public class InsertionSort extends SortAbstract {
	public static void sort(int[] arr) {
		int key = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;
		}
	}
}
