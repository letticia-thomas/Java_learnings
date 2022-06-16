import java.util.Arrays;
/*
 Divide and conquer approach
 partion method returns the correct position of pivot element
 	two loop variables one is for smaller index,one for loop throgh array
 Do quicksort recursively for left and right partition 
 */

public class QuickSort {
	
	public int partition(int arr[],int low, int high)
	{
		int pivot = arr[high];
		int i =low-1;
		int j,temp;
		for(j=low;j<=high-1;j++)
		{
			if(pivot>arr[j])
			{
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1]= arr[high];
		arr[high] = temp ;
		return i+1;
	}
	
	public void quickSort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int partition_index = partition(arr,low, high);
			quickSort(arr,low,partition_index-1);
			quickSort(arr,partition_index+1,high);
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {7,1,5,3,6,4};
		QuickSort q = new QuickSort();
		q.quickSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

}
