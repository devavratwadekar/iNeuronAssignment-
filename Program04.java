//WAP to sort an array using Merge Sort Algorithm.

class MergeSort		//Divide and Conqure
{
	int[] array;
	int[] tempMergeArray;	//temporary array
	int length;

	//method
	public void sort(int inputArr[]){
		array=inputArr;
		length=inputArr.length;
		tempMergeArray=new int[length];		
		divideArray(0,length-1);
	}

	public void divideArray(int lowerIdx,int higherIdx)
	{
		if(lowerIdx<higherIdx)
		{
			int middle=lowerIdx+(higherIdx-lowerIdx)/2;
			
			//it will sort left side of an array
			divideArray(lowerIdx,middle);

			//it will sort right side of an array
			divideArray(middle+1,higherIdx);

			MergeArray(lowerIdx,middle,higherIdx);
		}
	}

	public void MergeArray(int lowerIdx,int middle,int higherIdx){
		for(int i=lowerIdx;i<=higherIdx;i++){
			tempMergeArray[i]=array[i];
		}

		int i=lowerIdx;
		int j=middle+1;
		int k=lowerIdx;

		while(i<=middle && j<=higherIdx){
			if(tempMergeArray[i]<=tempMergeArray[j]){		//merge and replace
				array[k]=tempMergeArray[i];
				i++;
			}
			else{
				array[k]=tempMergeArray[j];
				j--;
			}
			k++;
		}
		while(i<=middle){
				array[k]=tempMergeArray[i];
				k++;
				i++;
		}
	}

}


public class Program04 
{
	public static void main(String[] args) 
	{
		int[] inputArr={48,36,13,52,19,94,12};

		System.out.println(" Original array :");
		for(int ar:inputArr){
			System.out.print(ar+" ");
		}

		MergeSort ms=new MergeSort();
		ms.sort(inputArr);

		System.out.print("\n After Merge Sort array : \n");
		for(int i:inputArr){
			System.out.print(i+" ");
		}
	}
}

