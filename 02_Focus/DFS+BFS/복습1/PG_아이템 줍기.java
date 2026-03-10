import java.util.*;

class PG_아이템 줍기 {
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static class Node{
        int x, y, dist;
        Node(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        int[][] map = new int[102][102]; // 좌표 2배
        // rectangle 좌표값을 더하기 초기화 필요
        // [좌측 하단 x, 좌측 하단 y, 우측 상단 x, 우측 상단 y]
        for(int[] r : rectangle){
            int x1 = r[0]*2; int y1 = r[1]*2;
            int x2 = r[2]*2; int y2 = r[3]*2;
            for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    if(map[i][j]==-1) continue;
                    if(i==x1 || i==x2 || j==y1 || j==y2){
                        map[i][j] = 1;
                    } else{
                        map[i][j] = -1;
                    }
                }
            }
        }
        return bfs(map, characterX*2, characterY*2, itemX*2, itemY*2)/2;
    }
    public int bfs(int[][] map, int startX, int startY, int targetX, int targetY){
        Queue<Node> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[102][102];
        q.add(new Node(startX, startY, 0));
        visited[startX][startY]=true;
        while(!q.isEmpty()){
            Node cur = q.poll();
            if(cur.x==targetX && cur.y==targetY){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(nx>=0 && nx<102 && ny>=0 && ny<102){
                    if(!visited[nx][ny] && map[nx][ny]==1){
                        q.add(new Node(nx, ny, cur.dist+1));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return 0;
    }
}