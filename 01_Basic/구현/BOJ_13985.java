import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_13985{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[2]);
        int answer = Integer.parseInt(input[4]);
        char c = input[1].charAt(0);

        System.out.println((c=='+') ? (num1 + num2 == answer ? "YES" : "NO")
                : (num1 - num2 == answer ? "YES" : "NO"));
    }
}