class 198.House Robber {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n+1];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
}
/* Wrong answer
Input:[2,1,1,2]
Output:3
Expected:4
class Solution {
    public int rob(int[] nums) {
        int odd=0;
        int even=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                even += nums[i];
            } else{
                odd += nums[i];
            }
        }
        return Math.max(even, odd);
    }
}
*/