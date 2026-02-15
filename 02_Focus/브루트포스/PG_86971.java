import java.util.*;

class PG_86971 {
    ArrayList<Integer>[] graph;
    public int solution(int n, int[][] wires) {
        int minDiff = Integer.MAX_VALUE;
        graph = new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] w : wires){
            graph[w[0]].add(w[1]);
            graph[w[1]].add(w[0]);
        }
        for(int[] w : wires){
            int v1 = w[0];
            int v2 = w[1];

            graph[v1].remove(Integer.valueOf(v2));
            graph[v2].remove(Integer.valueOf(v1));

            int cnt = bfs(v1, n);
            int diff = Math.abs(cnt - (n-cnt));
            minDiff = Math.min(minDiff, diff);

            graph[w[0]].add(w[1]);
            graph[w[1]].add(w[0]);
        }
        return minDiff;
    }
    public int bfs(int start, int n){
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n+1];

        queue.add(start);
        visited[start] = true;
        int cnt = 1;

        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : graph[cur]){
                if(!visited[next]){
                    queue.add(next);
                    visited[next] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}