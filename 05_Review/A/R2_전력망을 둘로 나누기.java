class R2_전력망을 둘로 나누기 {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        int[][] graph = new int[n+1][n+1];
        // n : 송전탑(노드)의 개수
        // 1. 트리 그래프 형태 만들기
        for(int[] w : wires){
            int v1 = w[0];
            int v2 = w[1];
            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }
        for(int[] w : wires){
            int v1 = w[0];
            int v2 = w[1];
            graph[v1][v2] = 0; // 인접 리스트 or 그래프
            graph[v2][v1] = 0;
            boolean[] visited = new boolean[n+1];
            int count = dfs(graph, v1, visited);
            int diff = Math.abs(count-(n-count));
            answer = Math.min(answer, diff);
            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }
        return answer; // 두 전력망이 가지고 있는 송전탑 개수의 차이(절대값)

    }
    public int dfs(int[][] graph, int cur, boolean[] visited){
        visited[cur] = true;
        int count=1;
        for(int next=1; next<graph.length; next++){
            if(graph[cur][next]==1 && !visited[next]){
                count += dfs(graph, next, visited);
            }
        }
        return count;
    }
}