class PG_181832 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0;
        int c = 0;
        int k = 0;
        for(int num=1; num<=n*n; num++){
            answer[r][c] = num;
            int nr = r + dr[k];
            int nc = c + dc[k];
            if(nc<0 || nc>=n || nr<0 || nr>=n || answer[nr][nc]!=0){
                k = (k+1)%4;
                nr = r + dr[k];
                nc = c + dc[k];
            }
            r = nr;
            c = nc;
        }
        return answer;
    }
}