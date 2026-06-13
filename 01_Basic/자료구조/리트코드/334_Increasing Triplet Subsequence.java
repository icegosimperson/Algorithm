class 334_Increasing Triplet Subsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= first){
                first = num;
            } else if(num <= second){
                second = num;
            } else{
                return true;
            }
        }
        return false;
    }
}
/* 3중 for문 시간 초과
class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] < nums[j] && nums[j] < nums[k]) return true;
                    else continue;
                }
            }
        }
        return flag;
    }
}
 */