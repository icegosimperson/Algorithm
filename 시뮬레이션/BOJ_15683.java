import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
- CCTV 방향 선택 -> DFS -> 방향 8가지 -> 모든 방향 시도 X -> 백트래킹
- 시간 복잡도 : 4^8 x 8 x 8 -> `O(NM)`
1. Node 객체로 cctv 정보를 입력 받는다
2. cctv.number(cctv 번호) 1~5번까지만 ArrayList<>(); 에 추가
3. dfs(int depth, int[][] board)
- base condition가 if(depth==cctvList.size)될 때 반환
- 현재 CCTV 객체 상태를 꺼내면서 switch(cctv 번호에 따라서) 복사한 배열을 재귀 탐색
4. dfs 탐색하면서 좌표 갱신
- `종료 조건` : `좌표 경계를 벗어나는 경우`, `6(벽)을 만날 경우 `
- 감시한 대상은 '#' 대신 숫자 7로 대체
5. `board[i][j]==0`의 값을 counting 함수로 최솟값 갱신하며 카운트
 */
class BOJ_15683{
    static int N, M;
    static int[][] board;
    static int min = Integer.MAX_VALUE;
    static int[] dx = {1, 0, -1, 0}; // 우, 상, 좌, 하
    static int[] dy = {0, 1, 0, -1};
    static class Node{
        int x, y, number;
        Node(int x, int y, int number){
            this.x = x;
            this.y = y;
            this.number = number; // cctv 번호
        }
    }

    static List<Node> cctvList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(1 <= board[i][j] && board[i][j] <=5){
                    cctvList.add(new Node(i, j, board[i][j]));
                }
            }
        }
        dfs(0, board);
        System.out.println(min);
    }
    private static int counting(int[][] board){
        int cnt = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(board[i][j]==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    private static void dfs(int depth, int[][] board){
        if(depth==cctvList.size()){ // base condition
            min = Math.min(min, counting(board));
            return;
        }
        Node cctv = cctvList.get(depth); // 현재 CCTV 꺼냄

        switch (cctv.number){
            case 1:
                for(int d=0; d<4; d++){
                    int[][] copy = copyBoard(board);
                    simulation(copy, cctv.x, cctv.y, d); // 우
                    dfs(depth+1, copy);
                }
                break;
            case 2:
                for(int d=0; d<4; d++){
                    int[][] copy = copyBoard(board);
                    simulation(copy, cctv.x, cctv.y, d); // 우
                    simulation(copy, cctv.x, cctv.y, (d+2)%4); // 좌
                    dfs(depth + 1, copy);
                }
                break;
            case 3:
                for(int d=0; d<4; d++){
                    int[][] copy = copyBoard(board);
                    simulation(copy, cctv.x, cctv.y, d); // 우
                    simulation(copy, cctv.x, cctv.y, (d+1)%4); // 상
                    dfs(depth + 1, copy);
                }
                break;
            case 4:
                for(int d=0; d<4; d++){
                    int[][] copy = copyBoard(board);
                    simulation(copy, cctv.x, cctv.y, d); // 우
                    simulation(copy, cctv.x, cctv.y, (d+1)%4); // 상
                    simulation(copy, cctv.x, cctv.y, (d+2)%4); // 좌
                    dfs(depth + 1, copy);
                }
                break;
            case 5:
                int[][] copy = copyBoard(board);
                for(int d=0; d<4; d++){
                    simulation(copy, cctv.x, cctv.y, d); // 상하좌우
                }
                dfs(depth + 1, copy);
                break;
        }

    }
    private static void simulation(int[][] board, int x, int y, int dir){
        while(true){
            x += dx[dir];
            y += dy[dir];
            if(!isValid(x, y)){ // 경계 벗어나면 종료
                break;
            }
            if(board[x][y]==6){
                break;
            }
            if(board[x][y]==0){ // 감시한 대상
                board[x][y] = 7; // 감시한 영역을 #대신 7로 바꿈
            }
        }
    }
    private static boolean isValid(int x, int y){
        return 0 <= x && x < N && 0 <= y && y < M;
    }
    private static int[][] copyBoard(int[][] board){
        int[][] copyBord = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                copyBord[i][j] = board[i][j];
            }
        }
        return copyBord;
    }
}

/*
    private static int[] rotate(int[] dir, int cnt){
        int[] rotatedBoard = new int[dir.length];
        for(int i = 0; (i < dir.length; i++){
            rotatedBoard[i] = (dir [i]+ cnt) % 4;
        }
        return rotatedBoard;
    }
 */