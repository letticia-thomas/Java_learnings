import java.util.*;
public class OddNumberOfOccurances {

	public static void main(String[] args) {
		int[] array = {0,0,2,2,3,4,4};
		int i;
		List list = new ArrayList();
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(i = 0;i<array.length;i++)
		{			if(!map.containsKey(array[i]))
						map.put(array[i],1);
					else		
						map.put(array[i],map.get(array[i])+1);	
		}
		
		for(i = 0;i<array.length;i++)
		{
			if(map.get(array[i])%2==0)
			{
				list.add(array[i]);
			}
		}
		System.out.println(list);
	}

}
