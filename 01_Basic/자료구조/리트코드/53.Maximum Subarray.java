class 53.Maximum Subarray{
    public int maxSubArray(int[] nums) {
        int dp=nums[0];
        int maxSum=nums[0];
        for(int i=1; i<nums.length; i++){
            dp=Math.max(nums[i], nums[i]+dp);
            maxSum=Math.max(maxSum, dp);
        }
        return maxSum;
    }
}