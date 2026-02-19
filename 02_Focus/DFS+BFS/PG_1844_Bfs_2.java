import java.util.*;

class PG_844_Bfs_2 { // 원본 배열 보존x => 방문 배열x
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int cur_x = cur[0];
            int cur_y = cur[1];
            if(cur_x==N-1 && cur_y==M-1){
                return maps[cur_x][cur_y];
            }
            for(int k=0; k<4; k++){
                int nx = cur_x + dx[k];
                int ny = cur_y + dy[k];
                if(nx>=0 && nx<N && ny>=0 && ny<M){
                    if(maps[nx][ny]==1){
                        maps[nx][ny] = maps[cur_x][cur_y]+1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1;
    }
}