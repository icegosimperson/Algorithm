import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력하기
// 재귀 호출이 아니라 dp를 떠올렸어야함

public class BOJ_1003{
    static int zeroCnt, oneCnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[2][41];
        dp[0][0] = 1; // N=0, 0의 호출 횟수
        dp[0][1] = 0; // N=0, 1의 호출 횟수
        dp[1][0] = 0; // N=1, 0의 호출 횟수
        dp[1][1] = 1; // N=1, 1의 호출 횟수
        for(int i=2; i<=40; i++){
            dp[0][i] = dp[0][i - 1] + dp[0][i - 2];
            dp[1][i] = dp[1][i - 1] + dp[1][i - 2];
        }
        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[0][N] + " " + dp[1][N]);
        }
    }
}