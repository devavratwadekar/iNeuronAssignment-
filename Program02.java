
//WAP to sort an array using Quick Sort Algorithm.

class QuickSortMiddle 
{
	int partition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];

		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	}

	void quickSortRecursion(int[] arr, int low, int high) 
	{
		int piv = partition(arr, low, high);

		if (low < piv - 1) {
			quickSortRecursion(arr, low, piv - 1);
		}
		if (high > piv) {
			quickSortRecursion(arr, piv, high);
		}
	}

	void printArray(int[] arr) 
	{
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}

public class Program02 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Original array : ");
		int[] arr = { 15, 9, 7, 13, 12, 16, 4, 18, 11 };
		int leng = arr.length;
		for (int elem : arr) {
			System.out.print(elem + " ");
		}

		System.out.println("\nAfter Quick Sort Array :");
		QuickSortMiddle qsm = new QuickSortMiddle();
		qsm.quickSortRecursion(arr, 0, leng - 1);
		qsm.printArray(arr);
	}
}
