import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2748 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            long[] dp = new long[n+2];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            for(int i=2; i<n+2; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            System.out.println(dp[n]);
        }
}
