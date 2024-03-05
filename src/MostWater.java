class MostWater{
    public static void main(String[] args){
        MostWater obj = new MostWater();
        int[] heights = {1,1};
        System.out.println("Result: "+obj.maxArea(heights));
    }
    public int maxArea(int[] height) {
        int max = 0;
        int water = 0;
        int start = 0;
        int end = height.length - 1;
        while (start <= end) {
            if(height[start]<height[end])
            {
                 water = height[start]*(end-start);
                 start++;
            }
            else{
                water = height[end]*(end-start);
                end--;
            }
            max = Math.max(max,water);
        }
        return max;
    }
}