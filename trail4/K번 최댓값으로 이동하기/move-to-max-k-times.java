import java.util.*;
public class Main {
    public static int n;
    public static int[][] grid;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static boolean[][] visited;
    public static int bestX;
    public static int bestY;
    public static int bestValue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt(); // 초기 시작 위치
        // Please write your code here.
        // BFS를 k번 반복?
        int curX = r-1; int curY = c-1;
        for(int m=0; m<k; m++){
            bfs(curX, curY);
            if(bestX==-1){
                break;
            }
            curX = bestX;
            curY = bestY;
        }
        System.out.println((curX+1) + " " + (curY+1));
    }
    public static void bfs(int x, int y){
        visited = new boolean[n][n];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        bestX = -1;
        bestY = -1;
        bestValue = -1;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            int value = grid[x][y];
            for(int d=0; d<4; d++){
                int nx = curX + dx[d];
                int ny = curY + dy[d];
                if(canGo(nx, ny, value)){
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    if(grid[nx][ny] > bestValue){
                        bestX = nx;
                        bestY = ny;
                        bestValue = grid[nx][ny];
                    } else if(grid[nx][ny] == bestValue){
                        if(nx<bestX || (nx==bestX && ny<bestY)){
                            bestX = nx;
                            bestY = ny;
                        }
                    }
                }
            }
        }    
    }
    public static boolean canGo(int x, int y, int value){
        if(x<0 || x>n-1 || y<0 || y>n-1){
            return false;
        }
        if(visited[x][y] || grid[x][y]>=value){
            return false;
        }  
        return true;
    }
}