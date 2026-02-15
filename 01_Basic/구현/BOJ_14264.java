import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_14264{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        double area = 0.5 * L * L * (Math.sqrt(3) / 2); // sin120 = Math.sqrt(3) / 2
        System.out.println(area);
    }
}