class failedSimulation {
    int[][] board;
    int curN;
    int nextLine;
    void init(int N, int mTiles[][]) {
        curN=N;
        board = new int[N][8];
        for(int i=0; i<N; i++){
            for(int j=0; j<8; j++){
                board[i][j] = mTiles[i][j];
            }
        }
        nextLine=8;
        while(remove()>0){
            down();
        }
        isValid();
    }
    void copyBoard(int[][] from, int[][] to){
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                to[i][j] = from[i][j];
            }
        }
    }
    int[] takeTurn() {
        int[] ret = new int[5];
        int max = -1;
        int[][] copyBoard = new int[8][8];
        copyBoard(board, copyBoard);

        for(int r=0; r<8; r++){
            for(int c=0; c<8; c++){
                if(c+1<8){
                    swap(r, c, r, c+1); //오른쪽 swap
                    int score = remove();
                    if(score > max && 0 < score){
                        max = score;
                        ret[0] = score; ret[1] = r; ret[2] = c; ret[3] = r; ret[4] = c+1;
                    }
                    copyBoard(copyBoard, board);
                }
                if(r+1 < 8){ // 왼쪽
                    swap(r, c,r+1, c);
                    int score = remove();
                    if(score > max && 0 < score){
                        max = score;
                        ret[0] = score; ret[1] = r; ret[2] = c; ret[3] = r+1; ret[4] = c;
                    }
                    copyBoard(copyBoard, board);
                }
            }
        }
        if(max > 0){
            swap(ret[1], ret[2], ret[3], ret[4]);
            ret[0] = getScore();
            isValid();
        } else{
            for(int r=0; r<8; r++){
                for(int c=0; c<8; c++){
                    board[r][c] = 0;
                }
            }
            down();
            isValid();
        }
        return ret; // 얻은 점수, 기준 좌표의 Y 값, 기준 좌표의 X 값, 인접 좌표의 Y 값, 인접 좌표의 X 값을
    }
    void swap(int r1, int c1, int r2, int c2){
        int temp = board[r1][c1];
        board[r1][c1] = board[r2][c2];
        board[r2][c2] = temp;
    }
    int getScore(){
        int total = 0;
        while(true){
            int cnt = remove(); // TODO: 지울 수 있는 타일 개수
            if(cnt==0) break;
            total += cnt;
            down(); // TODO: 빈칸 채우기
        }
        return total;
    }
    int remove(){
        boolean[][] checkBoard = new boolean[8][8];
        int total = 0; // 총 점수

        for(int r=0; r<8; r++) {
            for (int c = 0; c < 8; ) {
                if (board[r][c] == 0) {
                    c++;
                    continue;
                }
                int startC = c;
                int number = board[r][c];
                while (c<8 && board[r][c] == number) {
                    c++; // 오른쪽 이동
                }
                int length = c - startC;
                if (3 <= length) {
                    for (int j = startC; j<c; j++) {
                        checkBoard[r][j] = true;
                    }
                    if (length == 3) total += 1; // 1점
                    else if (length == 4) total += 4; // 4점
                    else total += 9; // 5개 이상 9점
                }
            }
        }
        for(int c=0; c<8; c++){ // 세로
            for(int r=0; r<8;){
                if(board[r][c]==0) {
                    r++;
                    continue;
                }
                int startR = r;
                int number = board[r][c];
                while(r<8 && board[r][c] == number) {
                    r++;
                }
                int length = r - startR;
                if(3 <= length){
                    for(int i=startR; i<r; i++) {
                        checkBoard[i][c] = true;
                    }
                    if(length==3) total +=1; // 1점
                    else if(length==4) total +=4; // 4점
                    else total += 9; // 5개 이상 9점
                }
            }
        }
        boolean canGo = false;
        for(int r=0; r<8; r++){
            for(int c=0; c<8; c++){
                if(checkBoard[r][c]){
                    board[r][c] = 0; // 타일 제거
                    canGo = true;
                }
            }
        }
        return canGo ? total : 0;
    }
    void down(){
        for(int c=0; c<8; c++){
            int pIdx = 0;
            for(int r=0; r<8; r++){
                if(board[r][c]!=0) {
                    int temp = board[r][c];
                    board[r][c] = 0;
                    board[pIdx][c] = temp;
                    pIdx++;
                }
            }
        }
        while(nextLine < curN){
            boolean flag = false;
            for(int c=0; c<8; c++){
                if(board[7][c]==0) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                break;
            }
            for(int c=0; c<8; c++){
                for(int r=0; r<7; r++){
                    if(board[r][c]==0){
                        board[r][c] = board[r+1][c];
                        board[r+1][c] = 0;
                    }
                }
                if(board[7][c]==0){
                    board[7][c] = board[nextLine][c];
                }
            }
            nextLine++;
        }
    }
    void isValid() {
        while (true) {
            // 1-a, 1-b: 빈공간 채우고 터지는 거 제거
            while (remove() > 0) down();

            // 1-c: 교환 가능한 곳이 있는지 눈으로만 확인 (시뮬레이션)
            boolean possible = false;
            for (int r = 0; r < 8 && !possible; r++) {
                for (int c = 0; c < 8 && !possible; c++) {
                    // 오른쪽 확인
                    if (c + 1 < 8) {
                        swap(r, c, r, c + 1);
                        if (canRemove()) possible = true;
                        swap(r, c, r, c + 1); // 원복
                    }
                    // 위쪽 확인
                    if (r + 1 < 8) {
                        swap(r, c, r + 1, c);
                        if (canRemove()) possible = true;
                        swap(r, c, r + 1, c); // 원복
                    }
                }
            }
            if (possible) break; // 교환 가능하면 준비 완료!

            // 없으면 전체 삭제 후 재시도
            for(int r=0; r<8; r++) for(int c=0; c<8; c++) board[r][c] = 0;
            down();
        }
    }
    boolean canRemove() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 6; c++) {
                if (board[r][c] != 0 && board[r][c] == board[r][c+1] && board[r][c] == board[r][c+2]) return true;
            }
        }
        for (int c = 0; c < 8; c++) {
            for (int r = 0; r < 6; r++) {
                if (board[r][c] != 0 && board[r][c] == board[r+1][c] && board[r][c] == board[r+2][c]) return true;
            }
        }
        return false;
    }
}
