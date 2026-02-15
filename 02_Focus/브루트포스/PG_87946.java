class PG_87946 {
    int max = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        return max;
    }
    public void dfs(int curK, int[][] dungeons, boolean[] visited, int cnt){
        max = Math.max(max, cnt);
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && curK >= dungeons[i][0]){
                visited[i] = true;
                dfs(curK-dungeons[i][1], dungeons, visited, cnt+1);
                visited[i] = false;
            }
        }
    }
}