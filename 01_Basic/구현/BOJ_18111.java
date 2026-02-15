import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
‘땅 고르기’ 작업에 걸리는 최소 시간과 그 경우 땅의 높이
 */
class BOJ_18111{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 세로
        int M = Integer.parseInt(st.nextToken()); // 가로
        int B = Integer.parseInt(st.nextToken()); // 인벤토리에 있는 블록

        int[][] board = new int[N][M];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, board[i][j]);
                min = Math.min(min, board[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int best = 0;
        for(int h=min; h<=max; h++) {
            int remove = 0; // 제거할 블록
            int add = 0; // 꺼낼 블록

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int height = board[i][j];
                    if (h < height) { // 클 경우
                        remove += height - h; // 제거해주기
                    } else { // 작을 경우
                        add += h - height; // 더해주기
                    }
                }
            }
            if (remove + B < add) {
                continue;
            }

            int ans = remove * 2 + add;

            if (ans < minTime || (ans == minTime && h > best)) {
                minTime = ans;
                best = h;
            }
        }
        System.out.println(minTime+ " " + best);
    }
}