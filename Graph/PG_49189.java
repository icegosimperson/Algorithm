import java.util.*;
class PG_49189 {
    private static boolean[] visited;
    private static int[] dist;
    private static List<List<Integer>> graph;
    public int solution(int n, int[][] edge) {
        graph = new ArrayList<>();
        visited = new boolean[n+1];
        dist = new int[n+1];

        for(int i=0; i<=n; i++){ // 1번 노드부터
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edge.length; i++){
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }

        Bfs(1);

        int max = 0;

        for(int i=1; i<=n; i++){
            max = Math.max(max, dist[i]);
        }
        int ans = 0;

        for(int i=1; i<=n; i++){
            if(dist[i]==max){
                ans++;
            }
        }
        return ans;
    }
    private static void Bfs(int s){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = true; // 방문 처리

        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : graph.get(cur)){ // 지금 방문 중인 노드(cur)에 연결 된 모든 노드(next)를 하나씩 탐색
                if(!visited[next]){ // 다음 배열을 방문하고
                    visited[next] =true; // 방문 처리하고
                    dist[next] = dist[cur] + 1; // 그 다음 노드 거리 계산
                    queue.offer(next); //큐에 넣고
                }
            }
        }
    }
}