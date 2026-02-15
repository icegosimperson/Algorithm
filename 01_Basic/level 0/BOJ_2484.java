import java.io.*;
import java.util.*;

public class BOJ_2484 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] cnt = new int[7]; // 1~6 사용
            for (int k = 0; k < 4; k++) {
                int v = Integer.parseInt(st.nextToken());
                cnt[v]++;
            }

            int prize = 0;

            // 4개 같음 / 3개 같음 체크
            for (int face = 1; face <= 6; face++) {
                if (cnt[face] == 4) {
                    prize = 50000 + face * 5000;
                    break;
                } else if (cnt[face] == 3) {
                    prize = 10000 + face * 1000;
                    break;
                }
            }

            if (prize == 0) {
                // 2쌍 / 한 쌍 / 모두 다른 경우
                int pairCount = 0;
                int pairSum = 0; // 2쌍이면 두 눈의 합, 한 쌍이면 해당 눈
                for (int face = 1; face <= 6; face++) {
                    if (cnt[face] == 2) {
                        pairCount++;
                        pairSum += face;
                    }
                }
                if (pairCount == 2) {
                    prize = 2000 + pairSum * 500;
                } else if (pairCount == 1) {
                    prize = 1000 + pairSum * 100;
                } else {
                    int maxFace = 0;
                    for (int face = 1; face <= 6; face++) {
                        if (cnt[face] > 0) maxFace = Math.max(maxFace, face);
                    }
                    prize = maxFace * 100;
                }
            }

            answer = Math.max(answer, prize);
        }

        System.out.println(answer);
    }
}