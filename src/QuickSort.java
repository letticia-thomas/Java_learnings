// In-place algorithm, space complexity: O(logn) for recursion. recurses through subarray
// Time complexity: In between O(nlogn) and O(n2)

package Sort;

class QuickSort {

    public static void main(String[] args) {
        int nums[] ={5,2,3,1};
        QuickSort obj = new QuickSort();
        obj.sortArray(nums);
        for(int num:nums)
        System.out.println(num);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int partition = partition(nums, start, end);
        quickSort(nums, start, partition - 1);
        quickSort(nums, partition + 1, end);
    }

    public int partition(int[] nums, int start, int end) {
        int i = start-1;
        int pivot = nums[end];
        for (int j = start; j < end; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        i++;
       swap(nums, end, i);
        return i;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}