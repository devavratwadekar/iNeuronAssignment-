//WAP to find the duplicates present in an array.

class Program01 {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 4, 3, 2, 2, 1 };
		
		System.out.println("Original array :");
		for(int i:arr) {
			System.out.print(i+" ");
		}

		System.out.println("\nDuplicate values in array are:");
		for (int i = 0; i < arr.length - 1; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if ((arr[i] == arr[j]) && (i != j)) 
				{
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
}
