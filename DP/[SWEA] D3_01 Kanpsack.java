import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;

// 시간 복잡도 : 100개 물건을 담던지, 담지 않는 경우 2^100 -> 배낭 O(n*m)
// 알고리즘 : 0/1 배낭문제 -> DP
class Solution
{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t=1; t<=T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 물품의 개수
            int K = Integer.parseInt(st.nextToken()); // 배낭 무게

            int[] weight = new int[N+1];
            int[] value = new int[N+1];
            for(int i=1; i<=N; i++){
                st = new StringTokenizer(br.readLine());
                weight[i] =Integer.parseInt(st.nextToken()); // 용량
                value[i] = Integer.parseInt(st.nextToken()); // 가치
            }
            int[][] dp = new int[N+1][K+1]; // 0/1 배낭문제 -> DP
            for(int i=1; i<=N; i++){
                for(int k=0; k<=K; k++){
                    if(weight[i]<=k){ // 담거나
                        dp[i][k] = Math.max(dp[i-1][k], dp[i-1][k-weight[i]] + value[i]);
                    }
                    else dp[i][k] = dp[i-1][k]; //담지 않음
                }
            }
            System.out.printf("#%d %d\n", t, dp[N][K]);
        }
    }
}
