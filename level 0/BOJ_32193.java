import java.io.*;
import java.util.*;

public class BOJ_32193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        long depth = 0L; // 누적 (A - B)

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            depth += (long) A - (long) B; // i번 역의 깊이 = Σ(Ak - Bk)
            sb.append(depth).append('\n');
        }

        System.out.print(sb.toString());
    }
}