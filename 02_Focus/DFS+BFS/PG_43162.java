/*
네트워크 개수 return
같은 네트워크 -> 사이클 개수 -> dfs 횟수

- 1차원 배열로 선언해도 되는 이유, 인접 리스트 구현?
    - 양방향 인접 행렬로 주어졌기 때문에 상관없음
    - 컴퓨터 하나(i)만 방문하면 그 노드 연결 다 타고 들어감 → 컴퓨터 단위로만 방문 여부 판단하면 됨 → 1차원 가능
 */

class PG_43162 {
    private static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n]; // 1차원 배열로 선언해도 되는 이유 :

        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i, computers);
                answer++;
            }
        }
        return answer;
    }
    private static void dfs(int n, int[][] computers){
        visited[n] = true; // 방문 처리
        for(int i=0; i<computers.length; i++){
            if(!visited[i] && computers[n][i]==1){
                dfs(i, computers);
            }
        }
    }
}