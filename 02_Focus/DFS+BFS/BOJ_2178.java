import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class BOJ_2178{
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, M;
    static int[][] board;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for(int j=0; j<M; j++){
                board[i][j] = Integer.parseInt(input.substring(j, j + 1));
            }
        }
        Bfs(0, 0);
        System.out.println(board[N-1][M-1]);
    }
    private static void Bfs(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer( new int[] {i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            for(int k=0; k<4; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(0<=x && x<N && 0<=y && y<M){
                    if(board[x][y]!=0 && !visited[x][y]){
                        visited[x][y] = true;
                        board[x][y] = board[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}