import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] grid;
    public static boolean[][] visited;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int block;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        visited = new boolean[n][n];
        // 블럭을 이루고 있는 칸의 개수 (4개 이상인지 확인)
        int breakBlock = 0; int maxBlock = -1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                block = 0;
                if(canGo(i, j, grid[i][j])){
                    dfs(i, j, grid[i][j]);
                }
                if(block>maxBlock){
                    maxBlock = block;
                }
                if(block>=4){
                    breakBlock++;
                }
            }
        }
        System.out.println(breakBlock + " " + maxBlock);
    }
    public static void dfs(int x, int y, int cur){
        visited[x][y] = true;
        block++;
        for(int k=0; k<4; k++){
            int nx = dx[k] + x;
            int ny = dy[k] + y;
            if(canGo(nx, ny, cur)){
                dfs(nx, ny, cur);
            }
        }
    }
    public static boolean canGo(int x, int y, int cur){
        if(x<0 || x>n-1 || y<0 || y>n-1){
            return false;
        }
        if(visited[x][y] || grid[x][y] != cur){
            return false;
        }
        return true;
    }
}