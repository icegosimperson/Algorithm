import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_31090 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            // N+1이 N의 끝 두 자리로 나누어 떨어진다면
            if((N+1) % (N%100)==0){
                System.out.println("Good");
            } else {
                System.out.println("Bye");
            }
            // N의 끝 두자리
            // 1234 -> 34
            // 1234 % 100 => 34
        }
    }
}