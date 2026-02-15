import java.io.*;
import java.util.StringTokenizer;

class BOJ_11722{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N + 1];
        for(int i=0; i<N; i++){
            dp[i] = 1;
            for(int j=0; j<i; j++){
                if(arr[i] < arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]+ 1);
                }
            }
        }
        int LIS = 0;
        for(int i=0; i<N; i++){
            LIS = Math.max(LIS, dp[i]);
        }
        bw.write(String.valueOf(LIS));
        bw.flush();
        bw.close();
    }
}
