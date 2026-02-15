import java.io.*;
import java.util.*;

public class BOJ_20361 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 사용 안 해도 무방
        int cur = Integer.parseInt(st.nextToken()); // 공의 시작 위치 X
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (cur == A) cur = B;
            else if (cur == B) cur = A;
            // 아니면 변화 없음
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cur);
        System.out.print(sb);
    }
}