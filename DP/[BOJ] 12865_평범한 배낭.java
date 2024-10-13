import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간 복잡도 : 100개 물건을 담던지, 담지 않는 경우 2^100 -> 배낭 O(n*m)

// 한줄에 배낭에 넣을 수 있는 물건들의 가치 합의 최댓값을 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 물품의 수
        int K = Integer.parseInt(st.nextToken()); // 배낭 무게

        int[] weight = new int[N+1];
        int[] value = new int[N+1];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        } // 배열 채우기

        int[][] dp = new int[N + 1][K+1];
        for(int i=1; i<=N; i++){
            for(int k=0; k<=K; k++){
                if(weight[i-1] <= k)
                    dp[i][k] = Math.max(dp[i-1][k], dp[i-1][k-weight[i-1]] + value[i-1]);// 담는 경우
                else    dp[i][k] = dp[i-1][k];// 담지 않는 경우

            }
        }
        System.out.println(dp[N][K]);
    }
}
