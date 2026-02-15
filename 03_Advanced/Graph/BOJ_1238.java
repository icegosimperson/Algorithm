import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class BOJ_1238{
    static class Node implements Comparable<Node> {
        int to, cost;
        Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
    private static List<Node>[] graph;
    private static List<Node>[] reverseGraph;
    private static int N, M, X;

    private static int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 학생
        M = Integer.parseInt(st.nextToken()); // 단방향 도로
        X = Integer.parseInt(st.nextToken()); // X에서 집에 갈 수 있음
        graph = new ArrayList[N + 1];
        reverseGraph = new ArrayList[N + 1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[from].add(new Node(to, cost));
            reverseGraph[to].add(new Node(from, cost));
        }
        int[] distFrom = dijkstra(X, graph);
        int[] distTo = dijkstra(X, reverseGraph);
        int max = 0;
        for(int i=1; i<=N; i++){
            max = Math.max(max, distFrom[i] + distTo[i]);
        }
        System.out.println(max);
    }
    private static int[] dijkstra(int x, List<Node>[] nodes){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[x] = 0;
        pq.offer(new Node(x, 0));

        while(!pq.isEmpty()){
            Node cur = pq.poll();
            if(cur.cost > dist[cur.to]) continue;
            for(Node next : nodes[cur.to]){
                if (dist[next.to] > cur.cost + next.cost) {
                    dist[next.to] = cur.cost + next.cost;
                    pq.offer(new Node(next.to, dist[next.to]));
                }
            }
        }
        return dist;
    }
}