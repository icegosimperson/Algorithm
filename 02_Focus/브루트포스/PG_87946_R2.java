class PG_87946_R2 {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return dfs(k, dungeons, visited, 0);
    }
    public int dfs(int curK, int[][] dungeons, boolean[] visited, int cnt){
        int max = cnt;
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && curK >= dungeons[i][0]){
                visited[i] = true;
                int result = dfs(curK-dungeons[i][1], dungeons, visited, cnt+1);
                max = Math.max(max, result);
                visited[i] = false;
                if(max==dungeons.length) {
                    return max;
                }
            }
        }
        return max;
    }
}