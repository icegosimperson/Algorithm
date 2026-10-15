import java.util.*;
public class Main {
    public static int n, m, max;
    public static int[][] grid;
    public static boolean[][] visited;
    public static int[][] startPoints;
    public static ArrayList<int[]> stones;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 3
        int k = sc.nextInt(); // 2
        m = sc.nextInt(); // 1
        grid = new int[n][n];
        stones = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if(grid[i][j]==1){
                    stones.add(new int[]{i, j});
                }
            }
        }
        startPoints = new int[k][2];
        for (int i = 0; i < k; i++) {
            startPoints[i][0] = sc.nextInt();
            startPoints[i][1] = sc.nextInt();
        }
        // Please write your code here.
        max = 0;
        choose(0, 0);
        System.out.println(max);
    }
    public static void bfs(){
        Queue<int[]> queue = new ArrayDeque<>();
        visited = new boolean[n][n];
        int count = 0;
        for(int[] s : startPoints){
            int x = s[0]-1;
            int y = s[1]-1;
            queue.add(new int[]{x, y});
            visited[x][y] = true;
            count++;
        }
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int curX = cur[0]; int curY = cur[1];
            for(int d=0; d<4; d++){
                int nx = curX + dx[d];
                int ny = curY + dy[d];
                if(canGo(nx, ny)){
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    count++;
                }
            }
        }
        max = Math.max(max, count);
    }
    public static void choose(int idx, int select){
        if(select==m){
            bfs();
            return;
        }
        if(idx>=stones.size()){
            return;
        }
        int[] s = stones.get(idx);
        int x = s[0]; int y = s[1];
        grid[x][y] = 0;
        choose(idx+1, select+1); // 돌 선택
        grid[x][y] = 1;

        choose(idx+1, select); // 돌 선택x
    }
    public static boolean canGo(int x, int y){
        if(x<0 || x>n-1 || y<0 || y>n-1){
            return false;
        }
        if(visited[x][y]==true || grid[x][y]==1){
            return false;
        }
        return true;
    }
}