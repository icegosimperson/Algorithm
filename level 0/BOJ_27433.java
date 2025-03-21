import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class BOJ_27433{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        System.out.println(factorial(N));
    }
    private static long factorial(long n){
        if(n==1 || n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
}