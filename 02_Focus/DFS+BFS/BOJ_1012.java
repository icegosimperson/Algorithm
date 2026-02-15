import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1012{
    static int M, N, K;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] board;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로 크기
            N = Integer.parseInt(st.nextToken()); // 세로 크기
            K = Integer.parseInt(st.nextToken()); // 배추 위치 개수

            board = new int[N][M];
            visited = new boolean[N][M];

            // 배추 위치 입력
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[y][x] = 1;
            }

            int cnt = 0; // 필요한 지렁이 수
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (board[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curY = cur[0];
            int curX = cur[1];

            for (int d = 0; d < 4; d++) {
                int ny = curY + dy[d];
                int nx = curX + dx[d];

                if (0 <= nx && nx < M && 0 <= ny && ny < N && board[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    queue.add(new int[]{ny, nx});
                }
            }
        }
    }
}