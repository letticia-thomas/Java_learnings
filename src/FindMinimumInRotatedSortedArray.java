/*
 Given the sorted rotated array nums of unique elements,
 return the minimum element of this array.
 */
public class FindMinimumInRotatedSortedArray {
	public static boolean FullyRotatedFlag = true;
	public  int findSmallIndex(int nums[],int low,int high)
	{
		int mid = (low+high)/2;
		if(low<=high && mid+1 <= nums.length-1)
		{
			if(nums[low]< nums[mid] && nums[high]>nums[mid])
				return nums[0];
			if(nums[mid]>nums[mid+1])
			{
				return(nums[mid+1]);
			}
			else
			{
				if(nums[low]<nums[mid])
					return(findSmallIndex(nums,mid+1,high));
				else if(nums[high]>nums[mid])
				    return(findSmallIndex(nums,low,mid));
				
			}
		}
		return nums[0];

	}

	public static void main(String[] args) {
		FindMinimumInRotatedSortedArray ob = new FindMinimumInRotatedSortedArray();
		int nums[] = {1,2,3,4,5,6,7};
		int low = 0;
		int high = nums.length-1;
		
		int result = ob.findSmallIndex(nums,low,high);
		System.out.println(result);
	}

}
