import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_15439{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((N-1)*N);
    }
}