/*
[최소 필요 피로도", "소모 피로도"]
최소 필요 피로도"는 항상 "소모 피로도"보다 크거나 같습니다.
최소 필요 피로도(min)이 Max인 곳과 소모 피로도(minus)가 min인 곳이 좋음
*/
class R2_피로도 {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        int total = dungeons.length; // 총 던전 수
        boolean[] visited = new boolean[total];
        dfs(k, dungeons, visited, 0);
        return answer; // 탐험 가능한 최대 던전 수
    }
    public void dfs(int k, int[][] dungeons, boolean[] visited, int cnt){
        answer = Math.max(answer, cnt);
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && k>=dungeons[i][0]){
                visited[i] = true;
                int nextK = k-dungeons[i][1];
                dfs(nextK, dungeons, visited, cnt+1);
                visited[i] = false;
            }
        }
    }
}