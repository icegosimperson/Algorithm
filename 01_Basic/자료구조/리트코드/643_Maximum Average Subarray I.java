// 2/4 = 0.5 / 51/4 = 12.75, 42/4
class 643_Maximum Average Subarray I {
    public double findMaxAverage(int[] nums, int k) {
        // sliding windows
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i=k; i<nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum/k; // 평균의 최댓값
    }
}