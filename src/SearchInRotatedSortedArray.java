/*
 Given the array nums after the possible rotation and an integer target, 
 return the index of target if it is in nums, or -1 if it is not in nums.
 */
public class SearchInRotatedSortedArray {
	public static int target = 1;
	public static int SearchInRotSortArray(int[] nums,int low,int high)
	{
		int mid = (low+high)/2;
		if(low<=high)
		{
			if(nums[mid]==target)
			{
				return mid;
			}
			//left ordered
			else if(nums[low]<=nums[mid])
			{
				if(nums[low]<=target && nums[mid]>=target)
				{
					// binary search
					return(SearchInRotSortArray(nums,low,mid-1));
				}
				else
				{
					return(SearchInRotSortArray(nums,mid+1,high));
				}
			}
			//right ordered 
			else if(nums[high]>=nums[mid])
			{
				if(nums[mid]<=target && target<=nums[high])
				{
					// binary search
					return(SearchInRotSortArray(nums,mid+1,high));
				}
				else
				{
					return(SearchInRotSortArray(nums,low,mid-1));
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = {3,1};
		int low = 0;
		int high = nums.length-1;
		int index = SearchInRotSortArray(nums,low,high);
		System.out.println(index);

	}

}
