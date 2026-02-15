import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_11282{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        N+=44031;
        char C = (char) N;
        System.out.println(C);
    }
}