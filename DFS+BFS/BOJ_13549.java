import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

// 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하기
// 이동 X-1 or X+1
// 순간이동 2*X
class BOJ_13549{
    private static int N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 수빈이가 있는 위치
        K = Integer.parseInt(st.nextToken()); // 동생이 있는 위치

        System.out.println(Bfs(N, K));
    }
    private static int Bfs(int n, int k){
        Deque<Integer> deque = new ArrayDeque<>();
        int[] dist = new int[100001];
        Arrays.fill(dist, -1);
        dist[N] = 0; // 시작점
        deque.add(N);

        while(!deque.isEmpty()){
            int cur = deque.poll();

            if(cur==K){
                return dist[cur];
            }
            int next = cur *2; // 순간 이동
            if(next<=100000 && dist[next] == -1){
                dist[next] = dist[cur]; // 비용 0
                deque.addFirst(next);
            }
            next = cur -1;
            if(next>=0 && dist[next]==-1){
                dist[next] = dist[cur] + 1;
                deque.addLast(next);
            }
            next = cur +1;
            if(next<=100000 && dist[next]==-1){
                dist[next] = dist[cur] +1;
                deque.addLast(next);
            }
        }
        return -1;
    }
}