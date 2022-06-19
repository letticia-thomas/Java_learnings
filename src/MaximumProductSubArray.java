/*
 Given an integer array nums, find a contiguous non-empty subarray within the array that has the
  largest product, and return the product.
 */


public class MaximumProductSubArray {
	
	public static int maximum(int one, int two,int three)
    {
        int max1 = one>two? one: two;
        return max1>three? max1: three;
    }
	
    public static int minimum(int one, int two, int three)
    {
    	int min1 = one<two? one: two;
        return min1<three? min1: three;
    }
	
	public static void main(String[] args) {
		
	        int nums[] = {-2,0,-4,2};
	        int max = 1;
			int min = 1;
	        int result = Integer.MIN_VALUE;
	        int temp;

			for(int i=0;i<nums.length;i++)
			{
	            if(nums[i]==0)
	            {
	                max = min =1;	              
	            }
	            temp = max;
	            max = maximum(min*nums[i], max*nums[i],nums[i]);
	            min = minimum(min*nums[i], temp*nums[i],nums[i]);
	            result = maximum(result,max,Integer.MIN_VALUE);
	        }	      
	            System.out.println(result);
	}

}
