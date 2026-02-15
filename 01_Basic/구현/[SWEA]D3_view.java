import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;

// 시간 복잡도 : N<=1000, O(건물의 개수 * 테스트 케이스) = O(N * 10) = O(N)
// 알고리즘 : 누적합
class Solution
{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0; // 조망권 확보 층수
            for (int i = 2; i < N - 2; i++) { // 조망권 확보 : 2 <= i <= N-3 최댓값 구하기
                int max = Math.max(Math.max(arr[i - 2], arr[i - 1]), Math.max(arr[i + 1], arr[i + 2])); //  Math.max(Math.max(a, b), Math.max(c, d))
                if (arr[i] > max) { // 인접 최댓값보다 높은 경우
                    cnt += arr[i] - max; // 조망권 층수 증가
                }
            }
            System.out.printf("#%d %d\n", t, cnt);
        }
    }
}
