import java.util.*;

class PG_1844_R2 {
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
        int n = maps.length;
        int m = maps[0].length;
        return bfs(maps, n, m);
    }
    public int bfs(int[][] maps, int n, int m){
        Queue<Node> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        queue.add(new Node(0, 0, 1));
        visited[0][0] = true;

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.x==n-1 && cur.y==m-1){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(!visited[nx][ny] && maps[nx][ny]==1){
                        visited[nx][ny] = true;
                        queue.add(new Node(nx, ny, cur.dist+1));
                    }
                }
            }
        }

        return -1;
    }
}