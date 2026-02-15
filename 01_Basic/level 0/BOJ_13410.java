import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_13410{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int max = 0;
        for(int i=1; i<=K; i++){
            int mul = N *i;
            int reverse = Integer.parseInt(new StringBuilder(String.valueOf(mul)).reverse().toString());
            max = Math.max(max, reverse);
        }
        System.out.println(max);
    }
}