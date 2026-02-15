import java.util.*;

class PG_87694_R2 {
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
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[102][102];
        for(int[] r : rectangle){
            int x1 = r[0]*2; int y1 = r[1]*2;
            int x2 = r[2]*2; int y2 = r[3]*2;
            for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    if(map[i][j]==2) continue;
                    if(i==x1 || i==x2 || j==y1 || j==y2){
                        map[i][j] = 1;
                    } else{
                        map[i][j] = 2;
                    }
                }
            }
        }
        return bfs(map, characterX*2, characterY*2, itemX*2, itemY*2);
    }
    public int bfs(int[][] map, int startX, int startY, int targetX, int targetY){
        Queue<Node> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[102][102];
        queue.add(new Node(startX, startY, 0));
        visited[startX][startY] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.x == targetX && cur.y==targetY){
                return cur.dist / 2;
            }
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(nx>=0 && nx<102 && ny>=0 && ny<102){
                    if(!visited[nx][ny] && map[nx][ny]==1){
                        visited[nx][ny] = true;
                        queue.add(new Node(nx, ny, cur.dist+1));
                    }
                }
            }
        }
        return 0;
    }
}