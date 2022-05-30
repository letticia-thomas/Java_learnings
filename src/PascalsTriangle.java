import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		    int rowIndex = 10;
	        List<Integer> index_zero = new ArrayList<Integer>(Arrays.asList(1));
	        List<Integer> index_one = new ArrayList<Integer>(Arrays.asList(1,1));
	        List<Integer> prev_list = new ArrayList<Integer>();
	        List<Integer> main_list = new ArrayList<Integer>();
	        
	        if(rowIndex==0)
	        {
	        	//return index_zero;
	        }
	        index_zero.forEach((Integer value) -> System.out.print(value));
	        System.out.println();
	        index_one.forEach((Integer value) -> System.out.print(value+" "));
	        System.out.println();
	        if(rowIndex==1)
	        {
	//        	return index_one;
	        }
	        prev_list = index_one;
	        for(int i=2;i<=rowIndex;i++)
	        {  
	            List<Integer> temp_list = new ArrayList<Integer>();
	        	temp_list.add(1);
	        	for(int j=0;j<i-1;j++)
	        	{
	        		temp_list.add(prev_list.get(j)+prev_list.get(j+1));
	        	}
	        	temp_list.add(1);
	        	prev_list =  temp_list;
	            main_list =temp_list;
	            temp_list.forEach((Integer value) -> System.out.print(value+" "));
	            System.out.println();
	        }
//	        return main_list;
	    }

	}


