
/*
 Given an integer array nums, return an array answer such that answer[i] is equal to
  the product of all the elements of nums except nums[i].
 */
import java.util.Arrays;
public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		int out[] = new int[4];
		int temp = 1;
		int i;
		// set the product of left part of each element
		for(i=0;i<nums.length;i++)
		{
			out[i] = temp;
			temp = temp*nums[i];
		}
		temp = 1;
		 // set tge product of right part of each element and multiply with left part
		for(i=nums.length-1;i>=0;i--)
		{
			out[i] = temp*out[i];
			temp = temp*nums[i];
		}
		System.out.println(Arrays.toString(out));
	}

}
