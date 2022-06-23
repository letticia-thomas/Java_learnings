
/*
 Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		
		int nums[] = {0,0,0,0};
		List<List> list = new ArrayList<List>();
		int sum,currSum;
		int i,j,k;
		Arrays.sort(nums);
		for(i=0;i<nums.length-1;i++)
		{
			sum = 0 - nums[i];
			j = i+1;
			k = nums.length-1;
			while(j<k)
			{
				currSum = nums[j]+nums[k];
				if(currSum == sum)
				{
					List<Integer> subList = new ArrayList<Integer>();
					subList.add(nums[i]);
					subList.add(nums[j]);
					subList.add(nums[k]);
					list.add(subList);
				}
				if(currSum>sum)
				{
					while(k>j && nums[k]==nums[k-1])
			        {
				        k--;
			        }
                    k--;
				}
				else
				{
					while(k>j && nums[j]==nums[j+1])
			        {
				        j++;
			        }
                    j++;
				}
                while(i<nums.length-1 && nums[i]==nums[i+1])
			    {
				    i++;
			    }
			}
		}
		System.out.println(list);

	}

}
