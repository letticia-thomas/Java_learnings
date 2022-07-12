
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int height[] = {8,2,4,3};
		int start = 0;
		int maxArea = Integer.MIN_VALUE;
		int area,width,len;
		int end = height.length-1;
		while(start<end)
		{
			width = end	- start;
			len = height[start]<height[end] ? height[start] : height[end];
			area = width * len ;
			maxArea = maxArea>area ? maxArea : area;
			if(height[start]<height[end])
			{
				start++;
			}
			else
			{
				end--;
			}
		}
		System.out.println(maxArea);
	}

}
