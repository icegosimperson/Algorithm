class PG_42898_R2 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] board = new int[n+1][m+1];
        for(int[] p : puddles){
            board[p[1]][p[0]] = -1;
        }
        board[1][1] = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(board[i][j]==-1){
                    board[i][j] = 0;
                    continue;
                }
                if(i>1) board[i][j] = (board[i][j] + board[i-1][j]) % 1_000_000_007;
                if(j>1) board[i][j] = (board[i][j] + board[i][j-1]) % 1_000_000_007;
            }
        }
        return board[n][m];
    }
}