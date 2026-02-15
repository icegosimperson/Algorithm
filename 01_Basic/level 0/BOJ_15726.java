import java.io.*;
import java.util.*;

public class BOJ_15726 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        long big = Math.max(B, C);
        long small = Math.min(B, C);

        long ans = (A * big) / small; // 양수이므로 정수 나눗셈이 곧 floor

        System.out.println(ans);
    }
}