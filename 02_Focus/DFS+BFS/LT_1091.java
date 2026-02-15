/*
방향 : 8방향 이동
0 : 방문 가능, 1 : 방문 X
bfs의 depth + 1 출력 하기
 */
import java.util.*;
class LT_1091 {
    private static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
    private static int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};
    private static boolean[][] visited;
    private static int n;
    static class Node{
        int x, y, dist;
        public Node(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        n = grid.length;
        visited = new boolean[n][n];

        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }

        return bfs(0, 0, grid);
    }
    private static int bfs(int s, int e, int[][] grid){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(s, e, 1));
        visited[s][e] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();

            if(cur.x == n-1 && cur.y==n-1){
                return cur.dist;
            }
            for(int k=0; k<8; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(isValid(nx, ny) && !visited[nx][ny] && grid[nx][ny]==0){
                    queue.offer(new Node(nx, ny, cur.dist+1));
                    visited[nx][ny] = true;
                }
            }
        }
        return -1; // 도착 불가
    }
    private static boolean isValid(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}