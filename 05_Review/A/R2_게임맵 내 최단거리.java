/*
이 문제에서 한 단계의 선택은 뭐지?
    어떤 칸으로 이동해야할 지 -> dr, dc 4방향 + 범위 + maps[r][c]==1인지 확인 + 방문 배열
→ 다음 단계로 뭘 기억해야 하지? 현재 위치, 이동 칸수(count++)
→ 언제 끝나지? 상대팀 진영 위치에 도달 (r, c) == (n, m)
*/
import java.util.*;
class R2_게임맵 내 최단거리 {
    public int solution(int[][] maps) {
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        visited[0][0] = true;
        queue.offer(new int[]{0, 0, 1});
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            int distance = cur[2];
            if(r==n-1 && c==m-1){
                return distance;
            }
            for(int k=0; k<4; k++){
                int nr = r + dr[k];
                int nc = c + dc[k];
                if(nr<0 || nr>=n || nc<0 || nc>=m){
                    continue;
                }
                if(!visited[nr][nc] && maps[nr][nc]==1){
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc, distance+1});
                }
            }
        }
        return -1;
    }
}
