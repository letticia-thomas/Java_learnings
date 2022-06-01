
public class HammingDistance {

	public static void main(String[] args) {
		int n = 100101;
		int count = 0;
		while(n!=0)
		{
			if(n%10==1)
			{
				count++;
			}
			n/=10;
		}
     System.out.println(count);
	}
}
