import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간 복잡도 : n<=45, 구현 가능
// n번째 피보나치 수 구하는 문제
// 알고리즘 : dp
// 이유 : 큰 문제를 작은 문제로 나눌 수 있음, 작은 문제의 결괏값들이 항상 같아야함
public class BOJ_2747{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 계단의 개수
        int[] dp = new int[N+1];
        dp[0] = 0; // 초기값 설정
        dp[1] = 1;
        for(int i=2; i<=N; i++){ // 초기화
            dp[i] = -1;
        }
        for(int i=2; i<=N; i++){
            dp[i] = dp[i-1] + dp[i-2]; // 8 = 3 + 5
        }
        System.out.println(dp[N]);
    }
}