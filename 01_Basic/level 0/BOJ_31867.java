import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_31867 {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 자릿수 (사실 사용 안함)
        String K = br.readLine(); // 큰 수는 문자열로 받기

        int even = 0;
        int odd = 0;

        // 각 자릿수 순회
        for (int i = 0; i < K.length(); i++) {
            int digit = K.charAt(i) - '0';
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // 결과 출력
        if (even > odd) {
            System.out.println(0); // 짝짝수
        } else if (odd > even) {
            System.out.println(1); // 홀홀수
        } else {
            System.out.println(-1); // 동일
        }
    }
}