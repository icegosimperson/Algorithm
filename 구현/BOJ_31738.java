import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_31738{
    private static long factorial(long n, long m){
        long answer = 1;
        for(long i=2; i<=n; i++){
            answer = (answer*i) % m;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        if(N >= M) System.out.println(0); // N! 안에 포함되면 N!%M==0
        else{
            System.out.println(factorial(N, M));
        }
    }
}