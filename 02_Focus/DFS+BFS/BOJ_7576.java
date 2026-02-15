import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class BOJ_7576{
    private static int[][] board;
    private static boolean[][] visited;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int M, N;
    private static int INF = Integer.MAX_VALUE;
    static class Node{
        int x, y, day;
        public Node(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day; // 걸리는 일 수
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // 가로 칸 수
        N = Integer.parseInt(st.nextToken()); // 세로 칸의 수

        Queue<Node> queue = new LinkedList<>();
        int min = INF;
        board = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j]==1){
                    queue.add(new Node(i, j, 0));
                }
            }
        }
        int answer = bfs(queue);
        System.out.println(check() ? answer : -1);
    }
    private static int bfs(Queue<Node> queue){
        int ans =  0;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            ans = Math.max(ans, cur.day);
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(isValid(nx, ny) && !visited[nx][ny] && board[nx][ny] == 0){
                    visited[nx][ny] = true;
                    board[nx][ny] = 1;
                    queue.add(new Node(nx, ny, cur.day+1));
                }
            }
        }
        return ans;
    }
    private static boolean isValid(int x, int y){
        return 0 <= x && x < N && 0 <= y && y < M;
    }
    private static boolean check(){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(board[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
}