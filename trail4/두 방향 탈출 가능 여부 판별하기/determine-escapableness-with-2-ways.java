import java.util.Scanner;
public class Main {
    public static int n, m;
    public static int[][] grid;
    public static boolean[][] visited;
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
        System.out.println(dfs(0, 0) ? 1 : 0);
    }
    public static boolean dfs(int x, int y){
        if(x==n-1 && y==m-1){
            return true;
        }
        int[] dx = {1, 0};
        int[] dy = {0, 1};
        for(int k=0; k<2; k++){
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(canGo(nx, ny)){
                visited[nx][ny] = true;
                if(dfs(nx, ny)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean canGo(int x, int y){
        if(x<0 || x>n-1 || y<0 || y>m-1){
            return false;
        }
        if(visited[x][y] || grid[x][y]!=1){
            return false;
        }
        return true;
    }
}