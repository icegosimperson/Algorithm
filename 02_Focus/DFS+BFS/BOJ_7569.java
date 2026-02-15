import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class BOJ_7569{
    private static int M, N, H;
    private static int[][][] board;
    private static int[] dx ={1, 0, -1, 0, 0, 0};
    private static int[] dy = {0, 1, 0, -1, 0, 0};
    private static int[] dh = {0, 0, 0, 0, 1, -1};
    static class Node{
        int h, x, y, day;
        public Node(int h, int x, int y, int day){
            this.h = h;
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    private static boolean[][][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Node> queue = new LinkedList<>();
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H  = Integer.parseInt(st.nextToken());
        board = new int[H][N][M]; // 높이 행 열
        visited = new boolean[H][N][M];

        for(int h=0; h<H; h++){
            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<M; j++){
                    board[h][i][j] = Integer.parseInt(st.nextToken());
                    if(board[h][i][j]==1){
                        queue.add(new Node(h, i, j, 0));
                        visited[h][i][j] = true;
                    }
                }
            }
        }
        int answer = bfs(queue);
        System.out.println(check() ? answer : -1);

    }
    private static int bfs(Queue<Node> queue){
        int ans = 0;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            ans = Math.max(ans, cur.day);
            for(int k=0; k<6; k++){
                int nh = cur.h + dh[k];
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(isValid(nh, nx, ny) && !visited[nh][nx][ny] && board[nh][nx][ny]==0){
                    visited[nh][nx][ny] = true;
                    board[nh][nx][ny]=1;
                    queue.add(new Node(nh, nx, ny, cur.day + 1));
                }
            }
        }
        return ans;
    }
    private static boolean isValid(int h, int x, int y){
        return 0 <= h && h <H && 0<= x && x <N && 0<=y && y<M;
    }
    private static boolean check(){
        for(int h=0; h<H; h++){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(board[h][i][j]==0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}