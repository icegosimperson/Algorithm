import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] dp = new int[15][15];

        for(int t =0; t<T; t++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            // 초기값 설정
            for(int i=0; i<15; i++){
                dp[i][1] = 1;
                dp[0][i] = i;
            }

            for(int i=1; i<15; i++){ // 1층~14층
                for(int j=2; j<15; j++){ //2호~14호
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }

            System.out.println(dp[k][n]);
        }
        sc.close();
    }
}

