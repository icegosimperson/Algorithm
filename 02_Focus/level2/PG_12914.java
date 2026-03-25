class Solution {
    public long PG_12914 (int n) {
        if(n<=2) return n;
        long[] dp = new long[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        return dp[n]; // 끝에 도달하는 방법 수
    }
}