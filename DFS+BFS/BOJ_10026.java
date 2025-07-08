import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

/*
BFS로 구현해야 될거 같은데

 */
class BOJ_10026{
    private static char[][] board;
    private static boolean[][] visited;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int N;
    static class Node{
        int x, y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        visited = new boolean[N][N];
        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<N; j++){
                board[i][j] = input.charAt(j);
            }
        }

        int cnt = 0;
        // 입력 확인용: 전체 출력해보기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]){
                    bfs(i, j, board[i][j]);
                    cnt++;
                }
            }
        }
        visited = new boolean[N][N];

        int cnt2 = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    bfs2(i, j, board[i][j]);
                    cnt2++;
                }
            }
        }
        System.out.println(cnt + " " + cnt2);
    }
    // 적록색약 : R == G
    private static void bfs(int x, int y, char color){
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(isValid(nx, ny)){
                    if(!visited[nx][ny] && board[nx][ny]==color){
                        visited[nx][ny] = true;
                        queue.offer(new Node(nx, ny));
                    }
                }
            }
        }
    }
    private static void bfs2(int x, int y, char color){
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(isValid(nx, ny)){
                    if(!visited[nx][ny] && same(color, board[nx][ny])){
                        visited[nx][ny] = true;
                        queue.offer(new Node(nx, ny));
                    }
                }
            }
        }
    }

    private static boolean same(char a, char b){
        if((a=='R' || a=='G') && (b=='R' || b=='G')){
            return true;
        }
        return a==b; // B == B or R==R
    }
    private static boolean isValid(int nx, int ny){
        return 0 <= nx && nx < N && 0<= ny && ny < N;
    }
}