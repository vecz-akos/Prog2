package ArraySort;

public class SortTester {

	public static void main(String[] args) {
		final int[] originalArray = { 2, 4, 3456, -2, 2021 };
		int[] arr = originalArray.clone();

		System.out.println("Original array:");
		SortAbstract.print(originalArray);

		BubbleSort.sort(arr);
		System.out.println("\nBubble sort:");
		BubbleSort.print(arr);

		arr = originalArray.clone();
		SelectionSort.sort(arr);
		System.out.println("\nSelection sort:");
		SelectionSort.print(arr);

		arr = originalArray.clone();
		InsertionSort.sort(arr);
		System.out.println("\nInsertion sort:");
		InsertionSort.print(arr);

		arr = originalArray.clone();
		QuickSort.sort(arr);
		System.out.println("\nQuick sort:");
		QuickSort.print(arr);
	}
}
