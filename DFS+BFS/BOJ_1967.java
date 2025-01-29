import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.*;

// 동생을 찾는 최소 시간 구하는 문제
// 같은 깊이, 카운트
class BOJ_1967{
    static boolean[] visited = new boolean[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(Bfs(N, K));
    }
    private static int Bfs(int start, int end){
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        // x-1, x+1, 2x
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++) {
                int cur = queue.poll();
                if (cur == end) {
                    return cnt;
                }
                int[] nextPos = {cur - 1, cur + 1, 2 * cur};
                for (int next : nextPos) {
                    if (next >= 0 && next <= 100000 && !visited[next]) {
                        queue.add(next);
                        visited[next] = true;
                    }
                }
            }
            cnt++;
        }
        return -1;
    }
}