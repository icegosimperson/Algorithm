class PG_1843 {
    public int solution(String arr[]) {
        int n = arr.length/2+1;
        int[][] min_dp = new int[n][n];
        int[][] max_dp = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                min_dp[i][j] = Integer.MAX_VALUE;
                max_dp[i][j] = Integer.MIN_VALUE;
            }
            min_dp[i][i] = max_dp[i][i] = Integer.parseInt(arr[i*2]);
        }
        for(int dist=1; dist<n; dist++){
            for(int i=0; i<n-dist; i++){
                int j = dist+i;
                for(int k=i; k<j; k++){
                    String op = arr[k*2+1];
                    if(op.equals("+")){
                        min_dp[i][j] = Math.min(min_dp[i][j], min_dp[i][k] + min_dp[k+1][j]);
                        max_dp[i][j] = Math.max(max_dp[i][j], max_dp[i][k] + max_dp[k+1][j]);
                    } else if(op.equals("-")){
                        min_dp[i][j] = Math.min(min_dp[i][j], min_dp[i][k] - max_dp[k+1][j]);
                        max_dp[i][j] = Math.max(max_dp[i][j], max_dp[i][k] - min_dp[k+1][j]);
                    }
                }
            }
        }
        return max_dp[0][n-1];
    }
}