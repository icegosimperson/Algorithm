import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_32025{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int H = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());

        int min = Math.min(H, W);
        System.out.printf("%.0f\n", (double)min/2*100);
    }
}