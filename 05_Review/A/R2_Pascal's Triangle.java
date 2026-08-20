class R2_Pascal's Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] dp = new int[numRows+1][numRows+1];
        for(int i=1; i<=numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=1; j<=i; j++){
                if(j==0 || i==j){
                    dp[i][j] = 1;
                } else{
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
                list.add(dp[i][j]);
            }
            result.add(list);
        }
        return result;
    }
}