import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class BOJ_1167{
    static class Node{
        int e, cost;
        Node(int e, int cost){
            this.e = e;
            this.cost = cost;
        }
    }
    private static ArrayList<ArrayList<Node>> graph;
    private static int maxDist = 0;
    private static int farNode = 0;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int V = Integer.parseInt(br.readLine()); // 정점의 개수
        graph = new ArrayList<>();
        visited = new boolean[V + 1];
        for(int i=0; i<=V; i++){
            graph.add(new ArrayList<>());
        }
        while(V-->0){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            while(true) {
                int to = Integer.parseInt(st.nextToken());
                if(to == -1) break;
                int cost = Integer.parseInt(st.nextToken());
                graph.get(from).add(new Node(to, cost));
            }
        }
        dfs(1, 0);
        Arrays.fill(visited, false);
        dfs(farNode, 0);
        System.out.println(maxDist);
    }
    private static void dfs(int node, int dist){
        visited[node] = true;
        if(dist > maxDist){
            maxDist = dist;
            farNode = node;
        }
        for(Node next : graph.get(node)){
            if(!visited[next.e]){
                dfs(next.e, dist + next.cost);
            }
        }
    }
}