/*
 Given an integer n, return an array ans of length n + 1 such that for each 
 i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 */
public class CountingBits {

	public static void main(String[] args) {
		int n =5;
		int[] ans = new int[n+1];
		ans[0] = 0;
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			int num =i;
			count = 0;
			//counting number of ones
			while(num!=0)
			{
				num =num & (num-1);
				count++;
			}
			ans[i] = count;
			
		}
		for (int element: ans) {
            System.out.println(element);
	}

}
}
