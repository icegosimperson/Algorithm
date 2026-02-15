import java.util.*;
import java.io.*;

public class Solution {
    static int N, M;
    static int[][] board;
    static int[] dx = {0, 0, 1, 1, 1, -1, -1, -1}; 
    static int[] dy = {1, -1, 0, 1, -1, 0, 1, -1}; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            board = new int[N + 1][N + 1]; 
            init(); // 보드 초기화

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int stone = Integer.parseInt(st.nextToken());
                find(y, x, stone);
            }

            int blackCount = 0, whiteCount = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (board[i][j] == 1) blackCount++; // 흑돌 개수
                    if (board[i][j] == 2) whiteCount++; // 백돌 개수
                }
            }
            System.out.printf("#%d %d %d\n", t, blackCount, whiteCount);
        }
    }

    static void init() {
        // 중앙에 초기 돌 배치
        board[N / 2][N / 2] = 2;
        board[N / 2 + 1][N / 2 + 1] = 2;
        board[N / 2 + 1][N / 2] = 1;
        board[N / 2][N / 2 + 1] = 1;
    }

    static boolean isRange(int y, int x) {
        // 주어진 좌표 (y, x)가 유효한 범위 내에 있는지 확인
        return y >= 1 && x >= 1 && y <= N && x <= N;
    }

    static void find(int Y, int X, int stone) {
        board[Y][X] = stone; // 돌 놓기

        // 8방향 탐색
        for (int d = 0; d < 8; d++) {
            int ny = Y + dy[d];
            int nx = X + dx[d];
            if (!isRange(ny, nx) || board[ny][nx] == 0 || board[ny][nx] == stone) continue; // 범위 밖 또는 빈 칸이거나 같은 돌이면 건너뜀

            // 상대방 돌이 있는 방향으로 계속 탐색
            while (true) {
                ny += dy[d];
                nx += dx[d];
                if (!isRange(ny, nx)) break; // 범위를 벗어나면 중단
                if (board[ny][nx] == 0) break; // 빈 칸을 만나면 중단
                if (board[ny][nx] == stone) { // 같은 색 돌을 만나면 뒤집기 수행
                    set(Y, X, ny, nx, stone, d);
                    break;
                }
            }
        }
    }

    static void set(int sy, int sx, int ey, int ex, int stone, int dir) {
        int y = sy, x = sx;
        while (true) {
            if (y == ey && x == ex) break;
            board[y][x] = stone; // 돌 색깔 변경
            y += dy[dir];
            x += dx[dir];
        }
    }
}
