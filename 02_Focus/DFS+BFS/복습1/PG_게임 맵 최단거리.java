import java.util.*;
class PG_게임 맵 최단거리 {
    private static class Node{
        int r=0, c=0, dist=0;
        Node(int r, int c, int dist){
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    public int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;
        boolean[][] visited = new boolean[N][M];
        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(0, 0, 1));
        visited[0][0] = true;
        while(!q.isEmpty()){
            Node cur = q.poll();
            if(cur.r==N-1 && cur.c==M-1){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nr = cur.r + dr[k];
                int nc = cur.c + dc[k];
                if(nr>=0 && nr<N && nc>=0 && nc<M){
                    if(!visited[nr][nc] && maps[nr][nc]==1){
                        visited[nr][nc] = true;
                        q.add(new Node(nr, nc, cur.dist+1));
                    }
                }
            }
        }
        return -1;
    }
}