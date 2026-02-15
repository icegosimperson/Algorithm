import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
주어진 수가 구구단표에 등장하면 1
아니면 0
 */
class BOJ_32710{
    private static boolean isGugudan(int n){
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(n==i*j){
                    return true;
                }
                if(n==j) return true;
            }
            if(n==i) return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(isGugudan(N) ? 1 : 0);
    }
}


