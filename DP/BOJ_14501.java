import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 상담을 적절히해서 백준이가 얻을 수 있는 최대 수익
/*
어떻게해야 최대로 수익을 낼 수 있을까?
DP : 작은 문제 -> 큰 문제
 */
public class BOJ_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] T = new int[N+1]; // 걸리는 시간
        int[] P = new int[N+1]; // 상담했을 때 받을 수 있는 금액
        int[] dp = new int[N+2];

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=N; i>=1; i--){
            if(i+T[i] > N+1){
                dp[i] = dp[i + 1];
            } else{
                dp[i] = Math.max(dp[i + 1], P[i] + dp[i + T[i]]);
            }
        }
        System.out.println(dp[1]);
    }
}
