import java.io.*;
// 시간 복잡도 : n<=10,000, O(N^2) 이상 가능
// n을 1, 2, 3의 합으로 나타내는 방법
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 T
		for(int t=0; t<T; t++) {
			int N = Integer.parseInt(br.readLine());
			int dp[] = new int[N+1];
			dp[0] =1;
		
			for(int i=1; i<=3; i++) {
				for(int j=i; j<=N; j++) {
					dp[j] += dp[j-i];
				}
			}
			System.out.println(dp[N]);
		}
		
		br.close();

	}
}
