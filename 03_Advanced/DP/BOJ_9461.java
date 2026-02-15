import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_9461{
    private static Long[] arr = new Long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr[0] = 0L;
        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;

        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp(N));
        }
    }
    private static long dp(int N){
        if(arr[N]==null){
            arr[N] = dp(N - 2) + dp(N - 3);
        }
        return arr[N];
    }
}