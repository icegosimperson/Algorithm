import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class BOJ_14940{
    private static int[][] board;
    private static boolean[][] visited;
    private static int targetX, targetY;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        visited = new boolean[n][m];
        targetX = 0;
        targetY = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j]==2){
                    targetX = i;
                    targetY = j;
                } else if(board[i][j]==0){ // 갈 수 없는 땅 
                    visited[i][j] = true; // 방문 처리
                }
            }
        }
        board[targetX][targetY] = 0; // 0으로 초기화해서 
        bfs(targetX, targetY); // 시작 지점으로

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visited[i][j]){
                    board[i][j] = -1; // 갈 수 있는 땅 중 도달할 수 없는 위치
                }
                sb.append(board[i][j]).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    private static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true; // 방문 처리

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            for(int k=0; k<4; k++){
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];
                if(isValid(nx, ny)){
                    if(!visited[nx][ny] && board[nx][ny]==1){
                        visited[nx][ny] = true;
                        board[nx][ny] = board[cur[0]][cur[1]] + 1; // 1칸 거리 추가
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
    private static boolean isValid(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}