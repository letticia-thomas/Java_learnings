// Longest Substring Without Repeating Characters
// jbpnbwwd out:4
import java.util.*;
public class LargestSubString {

	public static void main(String[] args) {
		String inp = "abcabc";


		Set<Character> newChar = new HashSet<Character>();
		int large = 0;
		int max =0;
		int next = 0;
		for(int forward_index=0;forward_index<inp.length();forward_index++)
		{
			if(newChar.contains(inp.charAt(forward_index)))
			{
				large = 1;
				for(int backward_index=forward_index-1;backward_index>=next;backward_index--)
				{	
					if(inp.charAt(forward_index)==inp.charAt(backward_index))
					{
						next = backward_index+1;
						break;
					}
                large++;	
				}
			}
			else
			{
				large++;
				newChar.add(inp.charAt(forward_index));
			}
			if(large>max)
			{
				max = large;
				
			}
			
		}
		System.out.println(max);		
	}

}

