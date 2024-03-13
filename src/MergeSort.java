package Sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        MergeSort obj = new MergeSort();
        int[] nums = {11,3,6,3,4};
        int[] result = obj.sortArray(nums);
        for(int num: result){
            System.out.println(num);
        }
    }

    public int[] sortArray(int[] nums) {

        if (nums.length == 1)
            return nums;
        int mid = nums.length / 2;

        int[] leftArray = Arrays.copyOfRange(nums, 0, mid);
        int[] rightArray = Arrays.copyOfRange(nums, mid, nums.length);

        leftArray = sortArray(leftArray);
        rightArray = sortArray(rightArray);

        return merge(leftArray, rightArray);

    }

    public int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] c = new int[a.length + b.length];
        while (i <= a.length - 1 && j <= b.length - 1) {
            if (a[i] > b[j]) {
                c[k++] = b[j++];
            } else {
                c[k++] = a[i++];
            }
        }
        while (i <= a.length - 1) {
            c[k++] = a[i++];
        }
        while (j <= b.length - 1) {
            c[k++] = b[j++];
        }
        return c;
    }
    
}
