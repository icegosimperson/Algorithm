import java.util.*;
class 1679_Max Number of K-Sum Pairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int cnt = 0;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum==k){
                left++;
                right--;
                cnt++;
            } else if(sum < k){
                left++;
            } else right--;
        }
        return cnt;
    }
}