import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_13241{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        System.out.println(lcm(A, B));
    }
    static long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b, a % b);
    }
    static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
}