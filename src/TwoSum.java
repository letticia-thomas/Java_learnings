import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		
		int nums[] = {3,3};
		int target = 6;
		List<Integer> out = new ArrayList<Integer>();
		
		/* Brute force approach O(n2) complexity
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    out.add(i);
                    out.add(j);
                }
            }
        }
        */
		// Hashmap approach
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int current;
		for(int i=0;i<nums.length;i++)
        {
			current = nums[i];
			if(map.containsKey(target-current))
			{
					out.add(i);
					out.add(map.get(target-current));
					break;
					
			}	
			if(!map.containsKey(current))
			{
				map.put(current,i);
			}
			
        }
        System.out.println(out);
        
   //     return(out);

	}

}
