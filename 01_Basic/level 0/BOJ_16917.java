import java.io.*;
import java.util.*;

public class BOJ_16917 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken()); // 양념
        long B = Long.parseLong(st.nextToken()); // 후라이드
        long C = Long.parseLong(st.nextToken()); // 반반(한 마리)
        long X = Long.parseLong(st.nextToken()); // 필요한 양념 수
        long Y = Long.parseLong(st.nextToken()); // 필요한 후라이드 수

        long pairs = Math.min(X, Y); // 세트로 묶을 수 있는 수
        long cost = 0;

        // 세트 부분: (양념1+후라이드1) vs (반반2마리)
        long setCost = Math.min(A + B, 2 * C);
        cost += pairs * setCost;

        // 남은 추가분
        if (X > Y) {
            long remain = X - Y; // 양념만 추가 필요
            cost += remain * Math.min(A, 2 * C);
        } else if (Y > X) {
            long remain = Y - X; // 후라이드만 추가 필요
            cost += remain * Math.min(B, 2 * C);
        }

        System.out.println(cost);
    }
}