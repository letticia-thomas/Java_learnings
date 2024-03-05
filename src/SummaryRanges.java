import java.util.ArrayList;
import java.util.List;

class SummaryRanges {
    public static void main(String[] args) {
        SummaryRanges obj = new SummaryRanges();
        int[] l = { 0, 2, 3, 4, 6, 8, 9 };
        obj.summaryRanges(l);
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        int i = 1;
        if (nums.length != 0) {
            int start = nums[0];
            int end = nums[0];

            while (i < nums.length) {
                String str = String.valueOf(start);
                if (nums[i - 1] == nums[i] - 1) {
                    if (i == nums.length - 1) {
                        str = str + "->" + String.valueOf(nums[i]);
                        result.add(str);
                        start = end;
                    }
                    i++;
                } else {
                    end = nums[i - 1];
                    if (start != end)
                        str = str + "->" + String.valueOf(end);
                    result.add(str);
                    if (i < nums.length)
                        start = nums[i];
                    i++;
                }
            }

            if (start != end || nums.length == 1) {
                String str = String.valueOf(start);
                result.add(str);
            }
        }
        return result;
    }
}