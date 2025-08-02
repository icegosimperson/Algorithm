import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class BOJ_1753{
    static class Node implements Comparable<Node>{
        int to, weight;
        Node(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o){
            return this.weight - o.weight;
        }
    }

    private static int INF = Integer.MAX_VALUE;
    private static int[] dist;
    private static boolean[] visited;
    private static List<Node>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken()); // 정점의 개수
        int E = Integer.parseInt(st.nextToken()); // 간선의 개수
        graph = new ArrayList[V + 1]; // graph = 정점의 개수 + 1
        dist = new int[V + 1];
        visited = new boolean[V + 1];

        int K = Integer.parseInt(br.readLine()); // 시작 정점

        for(int i=1; i<=V; i++){
            graph[i] = new ArrayList<>();
            dist[i] = INF;
        }
        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
        }
        dijkstra(K);
        for(int i=1; i<dist.length; i++){
            if(dist[i]==INF) System.out.println("INF");
            else System.out.println(dist[i]);
        }
    }
    private static void dijkstra(int k){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[k] = 0;
        pq.add(new Node(k, 0));
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            if(visited[cur.to]) continue;
            visited[cur.to] = true;
            for(Node next : graph[cur.to]){
                if (dist[next.to] > dist[cur.to] + next.weight) {
                    dist[next.to] = dist[cur.to] + next.weight;
                    pq.add(new Node(next.to, dist[next.to]));
                }
            }
        }
    }
}