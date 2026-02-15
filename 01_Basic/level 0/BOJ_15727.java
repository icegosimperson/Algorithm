import java.io.*;

public class BOJ_15727{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        int result = (L + 4) / 5; // 올림 처리
        System.out.println(result);
    }
}