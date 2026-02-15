import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// dp 누적합 최댓값 문제
// 구하는 것 : 합이 최대가 되는 경로에 있는 수의 합
// dp[][] : 삼각형의 (i, j)에 도달했을 때 만들 수 있는 최댓값 누적합
class BOJ_1932{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 삼각형의 크기
        int[][] dp = new int[n][n];
        int[][] triangle = new int[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++){
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = triangle[0][0];
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0){
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if(j==i){
                    dp[i][j] = dp[i - 1][j-1] + triangle[i][j];
                } else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + triangle[i][j];
                }
            }
        }

        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(dp[n-1][i], max);
        }
        System.out.println(max);
    }
}