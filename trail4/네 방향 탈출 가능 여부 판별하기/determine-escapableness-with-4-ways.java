import java.util.*;
public class Main {
    public static int n, m;
    public static int[][] grid;
    public static boolean[][] visited;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        System.out.println(bfs(0, 0) ? "1" : "0");
    }
    public static boolean bfs(int x, int y){
        Queue<int[]> queue = new ArrayDeque<>();
        visited[x][y] = true;
        queue.add(new int[]{x, y});
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            if(curX==n-1 && curY==m-1){
                return true;
            }
            for(int k=0; k<4; k++){
                int nx = curX + dx[k];
                int ny = curY + dy[k];
                if(canGo(nx, ny)){
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return false;
    }
    public static boolean canGo(int x, int y){
        if(x<0 || x>n-1 || y<0 || y>m-1){
            return false;
        }
        if(visited[x][y] || grid[x][y]==0){ // 뱀이 있는칸 = 0
            return false;
        }
        return true;
    }
}