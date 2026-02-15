import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
테트로미노 하나를 적절히 놓아서 테트로미노가 놓인 칸에 쓰여있는 수의 합들을 최대로
회전, 대칭 가능 -> 완전 탐색?
O(NM) = 500 * 500 * 5 * 4^3 -> 가능
재귀 -> 가지치기 필요 -> depth = 4
 */
class BOJ_14500{
    private static int N, M, max;
    private static int[][] board;
    private static boolean[][] visited;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        visited = new boolean[N][M];
        max = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                visited[i][j] = true; // (i, j)  테트로미노 시작
                dfs(i, j, 1, board[i][j]); // 4칸 탐색
                visited[i][j] = false;
            }
        }
        System.out.println(max);
    }
    private static void dfs(int x, int y, int depth, int sum){
        if(depth==4){
            max = Math.max(max, sum);
            return;
        }
        // 범위 내면 합을 구해 줌
        for(int k=0; k<4; k++){
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(isValid(nx, ny) && !visited[nx][ny]){
                if(depth==2){ // ㅗ, ㅓ, ㅜ, ㅏ
                    visited[nx][ny] = true;
                    dfs(x, y, depth+1, sum+board[nx][ny]); // 현재 깊이에서 한칸 더 가서 모양 완성
                    visited[nx][ny] = true;
                }
                visited[nx][ny] = true;
                dfs(nx, ny, depth + 1, sum + board[nx][ny]); // 지금까지 밟은 칸들 합 저장
                visited[nx][ny] = false;
            }
        }

    }
    private static boolean isValid(int x, int y){
        return 0 <= x && x <N && 0<= y && y<M;
    }
}