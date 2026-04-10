import java.util.*;
class Solution {
    public static int[] dr = {1, 0, -1, 0};
    public static int[] dc = {0, 1, 0, -1};
    public class Node{
        int r=0; int c=0; int dist=0;
        Node(int r, int c, int dist){
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }
    public int PG_1844(int[][] maps) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        int N = maps.length;
        int M = maps[0].length;
        boolean[][] visited = new boolean[N][M];
        visited[0][0] = true;
        q.add(new Node(0, 0, 1));
        while(!q.isEmpty()){
            Node cur = q.poll();
            if(cur.r==N-1 && cur.c==M-1){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nr = cur.r + dr[k];
                int nc = cur.c + dc[k];
                if(0<=nr && nr<N && 0<=nc && nc<M){
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