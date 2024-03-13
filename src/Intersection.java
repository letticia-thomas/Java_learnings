// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

import java.util.HashSet;
import java.util.Set;

class Intersection {
    public static void main(String[] args){
        Intersection obj = new Intersection();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = obj.intersection(nums1,nums2);
        for(int element: result){
            System.out.println(element);
        }

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(Integer num: nums1)
            set1.add(num);
        for(Integer num: nums2)
            set2.add(num);
        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int i=0;
        for(Integer element: set1){
            result[i++]= element;
        }

        return result;

    }
}