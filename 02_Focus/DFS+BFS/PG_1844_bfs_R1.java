import java.util.*;
class Solution {
    private static class Node{
        int x, y, dist;
        Node(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public int solution(int[][] maps) {
        Queue<Node> queue = new ArrayDeque<>();
        int N = maps.length;
        int M = maps[0].length;
        boolean[][] visited = new boolean[N][M];
        visited[0][0] = true;
        queue.add(new Node(0, 0, 1));

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.x==N-1 && cur.y == M-1){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(nx>=0 && nx<N && ny>=0 && ny<M){ // 범위 확인 먼저
                    if(!visited[nx][ny] && maps[nx][ny]==1){
                        queue.add(new Node(nx, ny, cur.dist+1));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}