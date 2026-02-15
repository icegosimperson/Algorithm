import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_1735{
    private static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int num1 = A*D+B*C;
        int num2 = B*D;

        int gcd = gcd(num1, num2);
        num1 /= gcd;
        num2 /= gcd;

        System.out.println(num1 + " " + num2);

    }
}