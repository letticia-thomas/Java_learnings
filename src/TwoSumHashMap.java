import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumHashMap {
    public static void main(String[] args) {
        TwoSumHashMap obj = new TwoSumHashMap();
        int[] nums = { 3, 3 };
        obj.twoSum(nums, 6);
    }

    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int pos1 = -1;
        int pos2 = -1;
        int end = nums.length - 1;
        int[] result = { -1, -1 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <= nums.length - 1; i++) {
            map.put(i, nums[i]);
        }
        int num[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(num);
        while (start <= end) {
            int sum = num[start] + num[end];
            if (target == sum) {
                pos1 = start;
                pos2 = end;
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (num[pos1] == entry.getValue() && result[0] == -1) {
                result[0] = entry.getKey();
                continue;

            }
            if (num[pos2] == entry.getValue() && result[1] == -1) {
                result[1] = entry.getKey();
            }
        }
        return result;
    }
}