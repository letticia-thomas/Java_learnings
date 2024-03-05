import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ThreeSum {
    public static void main(String[] args){
        ThreeSum obj = new ThreeSum();
        int[] nums = {-2,0,1,1,2};
        obj.threeSum(nums);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
                int element = nums[i];
                int start = i+1;
                int end = nums.length -1;
                while(start<end){
                    int sum = nums[start]+nums[end];
                    if((element+sum)==0){
                        List<Integer> l = new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[start]);
                        l.add(nums[end]);
                        Collections.sort(l);
                        if(!result.stream().anyMatch(list->list.equals(l)))
                            result.add(l);
                        start++;
                        end--;
                    }
                    else if(element+sum<0){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
        }
        return result;
    }
}