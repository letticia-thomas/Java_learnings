/*
 Given an integer array nums, find the contiguous subarray (containing at least one number) 
 which has the largest sum and return its sum.
 */
public class MaximumSum {

	public static void main(String[] args) {
	 int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
	 int result = nums[0];
	 int maxSumArray = 0;
	 for(int i =0;i<nums.length;i++)
	 {
		maxSumArray += nums[i];
		if(maxSumArray>result)
		{
			result = maxSumArray;
		}
		if(maxSumArray<0)
		{
			maxSumArray = 0;
		}
	 }
	 System.out.println(result);

	}

}
