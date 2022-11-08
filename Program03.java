//WAP to sort an array using Bubble Sort Algorithm.

class Program03 
{
	public static void main(String[] args) 
	{
		int[] a= {7,5,2,3,1,4,6};
		System.out.print(" Original Array : ");
		for(int elem:a){
			System.out.print(elem+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}

		System.out.print("\n After Bubble Sort Array : ");
		for(int el:a)
		{
			System.out.print(el+" ");
		}
	}
}
