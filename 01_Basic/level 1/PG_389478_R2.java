class PG_389478_R2 {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int[][] board = new int[n/w+1][w];
        int number = 1;
        int targetX =0, targetY = 0;

        for(int i=0; i<n/w+1; i++){
            for(int j=0; j<w; j++){
                if(number>n) break;
                int col = (i%2==0) ? j : (w-1-j);
                board[i][col] = number;
                if(number==num){
                    targetX = i;
                    targetY = col;
                }
                number++;
            }
        }
        for(int x=targetX; x<n/w+1; x++){
            if(board[x][targetY]!=0){
                answer++;
            }
        }
        return answer;
    }
}