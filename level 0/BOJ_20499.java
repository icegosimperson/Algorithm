import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_20499{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] parts = input.split("/");

        // 정수로 변환
        int K = Integer.parseInt(parts[0]);
        int D = Integer.parseInt(parts[1]);
        int A = Integer.parseInt(parts[2]);

        if(K+A<D){
            System.out.println("hasu");
        } else if(D==0){
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}