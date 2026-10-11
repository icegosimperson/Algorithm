import java.util.*;
public class Main {
    public static int n;
    public static int[][] grid;
    public static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] starts = new int[k][2];
        for (int i = 0; i < k; i++) {
            starts[i][0] = sc.nextInt();
            starts[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> queue = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            queue.add(new int[]{starts[i][0]-1, starts[i][1]-1});
            visited[starts[i][0]-1][starts[i][1]-1] = true;
        }
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            for(int d=0; d<4; d++){
                int nx = curX + dx[d];
                int ny = curY + dy[d];
                if(canGo(nx, ny)){
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean canGo(int x, int y){
        if(x<0 || x>n-1 || y<0 || y>n-1){
            return false;
        }
        if(visited[x][y] || grid[x][y]==1){
            return false;
        }
        return true;
    }
}