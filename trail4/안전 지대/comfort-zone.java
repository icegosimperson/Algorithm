import java.util.*;
public class Main {
    static int n, m;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        int maxHeight = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
                maxHeight = Math.max(grid[i][j], maxHeight);
            }
        }
        // Please write your code here.
        int bestK = 1; int bestArea = 0;
        for(int k=1; k<=maxHeight; k++){
            visited = new boolean[n][m];
            int area = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(canGo(i, j, k)){
                        visited[i][j] = true;
                        dfs(i, j, k);
                        area++;
                    }
                }
            }
            if(area > bestArea){
                bestArea = area;
                bestK = k;
            }
        }
        System.out.println(bestK + " " + bestArea);
    }
    public static void dfs(int x, int y, int k){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(canGo(nx, ny, k)){
                dfs(nx, ny, k);
            }
        }
    }
    // canGo
    public static boolean canGo(int x, int y, int k){
        if(x<0 || x>n-1 || y<0 || y>m-1){
            return false;
        }
        if(visited[x][y] || grid[x][y]<=k){
            return false;
        }
        return true;
    }
}