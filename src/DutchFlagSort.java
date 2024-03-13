// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.
//  Sort using three pointers all zeros comes before low pointer all 2 comes after high pointer and 1 lies between high and low mid pointer is used to travers

package Sort;
public class DutchFlagSort {

    public static void main(String[] args) {
        int nums[] ={2,0,1};
        DutchFlagSort obj = new DutchFlagSort();
        obj.sortColors(nums);
        for(int num:nums)
        System.out.println(num);
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while (mid <= high) {
            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 0) {
                this.swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 2) {
                this.swap(nums, mid, high);
                high--;
            }
        }

    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
