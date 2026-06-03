import java.util.*;
class Q1_Concatenation of Array {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }
}
/*
System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
*/
/*
import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int idx = 0;
        int cnt = 2;
        while(cnt-->0){
            for(int n : nums){
                ans[idx++] = n;
            }
        }
        return ans;
        // return Arrays.copyOf(nums, nums.length*2);
    }
}
*/