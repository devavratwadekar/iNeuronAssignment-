import java.util.Arrays;

//WAP to check whether an array is a subset of another array

public class Program06 {
	static boolean isSubset(int arr1[], int arr2[], int arr1leg, int arr2leg) {
		int i = 0, j = 0;

		if (arr1leg < arr2leg)
			return false;

		Arrays.sort(arr1); // sorts arr1
		Arrays.sort(arr2); // sorts arr2

		while (i < arr2leg && j < arr1leg) {
			if (arr1[j] < arr2[i])
				j++;
			else if (arr1[j] == arr2[i]) {
				j++;
				i++;
			} else if (arr1[j] > arr2[i])
				return false;
		}

		if (i < arr2leg)
			return false;
		else
			return true;
	}
	
	void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String args[]) {
		int arr1[] = { 11, 10, 13, 21, 30, 70 };
		int arr2[] = { 11, 30, 70, 10 };
		
		System.out.print("arr1[] Array : ");
		for(int el:arr1)
		{
			System.out.print(el+" ");
		}
		
		System.out.print("\narr2[] Array : ");
		for(int el:arr2)
		{
			System.out.print(el+" ");
		}
		
		int arr1leg = arr1.length;
		int arr2leg = arr2.length;

		System.out.println();
		
		if (isSubset(arr1, arr2, arr1leg, arr2leg))
			System.out.print(" \narr2[] is subset of arr1[] ");
		else
			System.out.print(" \narr2[] is not subset of arr1[] ");

	}
}