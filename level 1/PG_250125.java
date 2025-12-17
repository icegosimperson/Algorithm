/*
b, r, o, r
r, r, b, o
b, o, r, r
o, o, r, b

*/
class PG_250125 {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int cnt = 0; // 같은 색으로 색칠된 칸의 개수 저장 변수
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        for(int i=0; i<4;i++){ // h=1, w=1
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if(0 <= h_check && h_check < n && 0 <= w_check && w_check < n){
                if(board[h][w].equals(board[h_check][w_check])){
                    cnt++;
                }
            }
        }
        return cnt; // 우 중 같은 색깔 칸의 개수
    }
}