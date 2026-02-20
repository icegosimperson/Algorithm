/*
네트워크 개수를 찾는 문제 -> 그래프 순회 boolean 함수로 네트워크 개수++?
이 유형은, dfs로 그래프 개수를 찾는 문제이다.
*/
import java.util.*;
class PG_43162_dfs {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i, n, computers, visited);
                answer++;
            }
        }
        return answer;
    }
    public void dfs(int cur, int n, int[][] computers, boolean[] visited){
        visited[cur] = true;
        for(int next = 0; next<n; next++){
            if(computers[cur][next]==1 && !visited[next]){
                dfs(next, n, computers, visited);
            }
        }
    }
}