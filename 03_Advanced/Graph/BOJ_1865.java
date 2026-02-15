import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class BOJ_1865 {
    static class Edge {
        int from, to, cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int TC = Integer.parseInt(br.readLine());

        while (TC-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 지점의 수
            int M = Integer.parseInt(st.nextToken()); // 도로의 개수
            int W = Integer.parseInt(st.nextToken()); // 웜홀의 개수

            List<Edge> edges = new ArrayList<>();
            int[] dist = new int[N + 1];
            Arrays.fill(dist, 0);
            dist[1] = 0;

            for (int i = 0; i < M; i++) { // 각 도로의 정보
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken()); // 시작 지점
                int E = Integer.parseInt(st.nextToken()); // 도착 지점
                int T = Integer.parseInt(st.nextToken()); // 이동하는 데 걸리는 시간
                edges.add(new Edge(S, E, T)); // 양방향
                edges.add(new Edge(E, S, T));
            }

            for (int i = 0; i < W; i++) { // 웜홀 입력
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken());

                edges.add(new Edge(S, E, -T));
            }
            for (int i = 1; i < N; i++) {
                for (Edge e : edges) {
                    if (dist[e.from] + e.cost < dist[e.to]) {
                        dist[e.to] = dist[e.from] + e.cost;
                    }
                }
            }
            // 출발 위치로 돌아오는 것이 가능하면 YES
            // 불가능하면 NO 출력
            boolean flag = false;
            for(Edge e : edges){
                if(dist[e.from] + e.cost < dist[e.to]){
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}