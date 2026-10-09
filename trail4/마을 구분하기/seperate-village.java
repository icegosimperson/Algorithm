import java.util.*;

public class Main {
    public static int n;
    public static int[][] grid;
    public static boolean[][] visited;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int people;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        visited = new boolean[n][n];
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    if(canGo(i, j)){
                        people = 0;
                        dfs(i, j);
                        answer.add(people);
                    }
                }
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for(int people : answer){
            System.out.println(people);
        }
    }
    public static void dfs(int x, int y){
        visited[x][y] = true;
        people++;
        for(int k=0; k<4; k++){
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(canGo(nx, ny)){
                dfs(nx, ny);
            }
        }
    }
    public static boolean canGo(int x, int y){
        if(x<0 || x>n-1 || y<0 || y>n-1){
            return false;
        }
        if(visited[x][y] || grid[x][y]!=1){
            return false;
        }
        return true;
    }
}