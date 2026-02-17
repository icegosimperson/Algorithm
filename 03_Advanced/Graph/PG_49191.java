class PG_49191 {
    public int solution(int n, int[][] results) {
        int answer = 0;
        boolean[][] board = new boolean[n+1][n+1];
        for(int[] r : results){
            board[r[0]][r[1]] = true;
        }
        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(board[i][k] && board[k][j]){
                        board[i][j] = true;
                    }
                }
            }
        }
        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){
                if(i==j) continue;
                if(board[i][j] || board[j][i]){
                    cnt++;
                }
            }
            if(cnt==n-1) answer++;
        }
        return answer;
    }
}