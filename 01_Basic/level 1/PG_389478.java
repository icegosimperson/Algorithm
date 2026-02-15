class PG_389478 {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int[][] board = new int[n/w+1][w];
        int number =1;
        for(int r=0; r<n/w+1; r++){
            if(r%2==0){
                for(int c=0; c<w; c++){
                    if(number<=n) board[r][c] = number++;
                }
            } else{
                for(int c=w-1; c>=0; c--){
                    if(number<=n) board[r][c] = number++;
                }
            }
        }

        int targetR = 0; int targetC = 0;
        for(int r=0; r<n/w+1; r++){
            for(int c=0; c<w; c++){
                if(board[r][c]==num){
                    targetR = r;
                    targetC = c;
                    break;
                }
            }
        }

        for(int r=targetR; r<n/w+1; r++){
            if(board[r][targetC]!=0){
                answer++;
            }
        }
        return answer;
    }
}