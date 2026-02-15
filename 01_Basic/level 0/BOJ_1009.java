import java.io.*;
import java.util.*;

public class BOJ_1009{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int d = a % 10;
            int ans;

            if (d == 0) {
                ans = 10; // 일의 자리가 0이면 10번 컴퓨터
            } else {
                int[] cycle = getCycle(d);
                int idx = (b - 1) % cycle.length;
                ans = cycle[idx];
            }
            sb.append(ans).append('\n');
        }

        System.out.print(sb.toString());
    }

    private static int[] getCycle(int d) {
        switch (d) {
            case 1: return new int[]{1};
            case 2: return new int[]{2, 4, 8, 6};
            case 3: return new int[]{3, 9, 7, 1};
            case 4: return new int[]{4, 6};
            case 5: return new int[]{5};
            case 6: return new int[]{6};
            case 7: return new int[]{7, 9, 3, 1};
            case 8: return new int[]{8, 4, 2, 6};
            case 9: return new int[]{9, 1};
            case 0: return new int[]{0}; // 안전장치(실제로는 위에서 걸러짐)
        }
        throw new IllegalArgumentException("Invalid last digit");
    }
}