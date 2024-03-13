package Sort;

public class BubbleSort {

    public static void main(String[] args) {
        int nums[] ={2,5,2,21,12,0};
        BubbleSort obj = new BubbleSort();
        obj.sortColors(nums);
        for(int num:nums)
        System.out.println(num);
    }

    public void sortColors(int[] nums) {
        for(int i=0 ; i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }  
    }  
    
}
