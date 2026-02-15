import java.util.*;
import java.io.*;

public class BOJ_9358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 수열을 리스트에 저장
            List<Long> sequence = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                sequence.add(Long.parseLong(st.nextToken()));
            }

            // 수열이 2개가 될 때까지 접기 반복
            while (sequence.size() > 2) {
                sequence = foldSequence(sequence);
            }

            // 승부 판정
            String winner;
            if (sequence.get(0) > sequence.get(1)) {
                winner = "Alice";  // 상근이 승리
            } else {
                winner = "Bob";    // 창영이 승리
            }

            System.out.println("Case #" + t + ": " + winner);
        }
    }

    // 수열을 한 번 접는 함수
    private static List<Long> foldSequence(List<Long> sequence) {
        int n = sequence.size();
        List<Long> newSequence = new ArrayList<>();

        // 앞에서부터 뒤에서부터 더하기
        for (int i = 0; i < (n + 1) / 2; i++) {
            if (i == n - 1 - i) {
                // 홀수 개일 때 가운데 원소는 자기 자신과 더함
                newSequence.add(sequence.get(i) + sequence.get(i));
            } else {
                // 양 끝에서부터 더함
                newSequence.add(sequence.get(i) + sequence.get(n - 1 - i));
            }
        }

        return newSequence;
    }
}