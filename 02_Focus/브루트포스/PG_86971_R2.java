class PG_86971_R2 {
    boolean[][] graph;
    public int solution(int n, int[][] wires) {
        int answer = n;
        graph = new boolean[n+1][n+1];

        for(int[] w : wires){ // solved2) 노드의 개수(V) 1,000개 이하 => 인접행렬
            graph[w[0]][w[1]] = graph[w[1]][w[0]] = true;
        }
        for(int[] w : wires){
            int v1 = w[0];
            int v2 = w[1];
            graph[v1][v2] = graph[v2][v1] = false;
            int cnt = dfs(v1, n, new boolean[n+1]);
            answer = Math.min(answer, Math.abs(cnt-(n-cnt)));
            graph[v1][v2] = graph[v2][v1] = true;
        }
        return answer;
    }
    public int dfs(int start, int n, boolean[] visited){
        visited[start] = true;
        int cnt = 1;
        for(int next=1; next<=n; next++){
            if(!visited[next] && graph[start][next]){
                cnt += dfs(next, n, visited);
            }
        }
        return cnt;
    }
}