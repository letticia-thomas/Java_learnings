/*Given two integers a and b,return the sum of the two integers
without using the operators + and -.
*/

import java.util.*;
public class SumOfTwoIntegers {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int shift;
		// iterating through the loop till carry 0
		while(b!=0)
		{
		// calculating carry here and left shift to one place to add with the calculated sum
		shift = (a&b)<<1;
		// find sum using xor operation
		a = a^b;
		b = shift;
		}
		System.out.println(a);

	}

	}

