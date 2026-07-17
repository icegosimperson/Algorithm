class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}
/*
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
 */
/*

 */
/*
        Arrays.sort(nums);
        int left=0;
        for(int right=1; right<nums.length; right++){
            if(nums[left]==nums[right]){
                return true;
            }
            left++;
        }
        return false;
    }
}
 */