/*
 Given an array nums containing n distinct numbers in the range [0, n], 
 return the only number in the range that is missing from the array.
 */

public class MissingNumber {

	public static void main(String[] args) {
		int nums[]= {3,0,1};
		int n = nums.length;
		int sum = (n*(n+1)/2);
		int arrSum = 0;
		for(int i=0;i<n;i++)
		{
			arrSum = arrSum+nums[i];
		}
		System.out.println(sum-arrSum);
	}

}
