/*
 Given an integer array nums, return true if any value appears 
 at least twice in the array, and return false if every element 
 is distinct.
 */
import java.util.*;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[] = {2,3,2,5};
		boolean result= false;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(set.contains(nums[i]))
			{
				result = true;
				break;
			}
			else
			{
				set.add(nums[i]);
			}
		}
		System.out.println(result);
	}

}
