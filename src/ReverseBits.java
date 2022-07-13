/*
 Reverse bits of a given 32 bits unsigned integer.
 */

import java.util.*;
public class ReverseBits {

	public static void main(String[] args) {
		int  n = 2;
		int rev = 0;
		int j = 31;
		 while(n!=0){
	            if((n&1)==1){
	                rev|=(1<<j);
	            }
	            j--;
	            n>>=1;
	        }
	     System.out.println(rev);
	}

}
