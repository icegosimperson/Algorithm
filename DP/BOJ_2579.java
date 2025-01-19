import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
dp[i] : i번째 계단에서 얻을 수 있는 최대 점수
i-1번째 계단을 밟는 경우 : dp[i] = dp[i-3] + score[i-1] + score[i], 연속된 3계단은 밟을 수 없음, 1번째 + 3번째
i-2번째 계단을 밟는 경우 : dp[i] = dp[i-2] + score[i]
 */
public class BOJ_2579 {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[n+1];
        dp[1] = arr[1];

        if(n>=2){
            dp[2] = arr[1] + arr[2];
        }

        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
        }
        System.out.println(dp[n]);
    }
}
