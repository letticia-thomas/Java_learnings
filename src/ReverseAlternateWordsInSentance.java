import java.util.*;

public class ReverseAlternateWordsInSentance {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	        String str = in.nextLine();
	        String out = "";
	        String[] array = str.split("\\s+");
	        
	        for(int i=0;i<array.length;i++)
	        {
	            String st = array[i];
	            String revStr = "";
	            if(i%2==0)
	            {
	            	for(int j=st.length()-1;j>=0;j--)
	            	{
	            		char ch = st.charAt(j);
	            		revStr +=ch;
	            	}
	            }
	            else
	            {
	            	revStr = st;
	            }
	            out = out+revStr+" ";
	        }
	        System.out.println(out);

	}

}
