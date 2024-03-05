class SearchInsertPosition {
    public static void main(String[] args){
        SearchInsertPosition obj = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        obj.searchInsert(nums,2);
    }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pos = 0;
        if (target < nums[start])
            return 1;
        if (target > nums[end])
            return end + 1;
        while (start <= end) {
            int mid = (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else {
                if (mid + 1 < nums.length - 1 && mid - 1 >= 0)
                    if (nums[mid+1] > target && nums[mid-1] < target)
                        pos = mid;
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return pos;
    }
}