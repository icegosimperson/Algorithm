class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curCnt = 0;
        for(int num : nums){
            if(num==1){
                curCnt++;
                max = Math.max(curCnt, max);
            } else curCnt = 0;
        }
        return max;
    }
}
/*
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int start = -1; int last = -1;
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                if(start==-1){
                    start = i;
                }
                last = i;
                temp = last-start+1;
            } else{ // nums[i]==0
                start = -1; last = -1;
                temp = 0;
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}
*/