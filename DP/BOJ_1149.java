import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_1149{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] color = new int[N][3];
        int[][] dp = new int[N][3];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                color[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = color[0][0];
        dp[0][1] = color[0][1];
        dp[0][2] = color[0][2];

        for(int i=1; i<N; i++){
            dp[i][0] = color[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]); // R
            dp[i][1] = color[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]); // G
            dp[i][2] = color[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]); // B
        }
        int min = Math.min(dp[N - 1][0], Math.min(dp[N - 1][1],dp[N - 1][2]));
        System.out.println(min);
    }
}