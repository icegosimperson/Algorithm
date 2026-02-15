import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class BOJ_13459{
    private static char[][] grid;
    private static int n, m;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    static class Node{
        int redX, redY, blueX, blueY, cnt;
        Node(int redX, int redY, int blueX, int blueY, int cnt){
            this.redX = redX;
            this.redY = redY;
            this.blueX = blueX;
            this.blueY = blueY;
            this.cnt = cnt;
        }
        public String toKey(){
            return redX + "," + redY + "," + blueX + "," + blueY;
        }
    }
    private static int[] move(int x, int y, int dir){
        int nx = x, ny = y;
        while(true){
            nx += dx[dir];
            ny += dy[dir];
            if(grid[nx][ny]=='#'){
                nx -= dx[dir];
                ny -= dy[dir];
                break;
            } else if(grid[nx][ny]=='O'){
                break;
            }
        }
        return new int[]{nx, ny};
    }
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new char[n][m];
        for(int i=0; i<n; i++){
            grid[i] = br.readLine().toCharArray();
        }
        System.out.println(bfs());
    }
    private static int bfs(){
        int redX = 0, redY=0, blueX =0, blueY=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]=='R'){
                    redX = i;
                    redY = j;
                } else if(grid[i][j]=='B'){
                    blueX = i;
                    blueY = j;
                }
            }
        }
        Queue<Node> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        Node start = new Node(redX, redY, blueX, blueY, 0);
        queue.add(start);

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.cnt> 10){
                return 0;
            } else if(grid[cur.redX][cur.redY]=='O'){
                return 1;
            }

            for(int k=0; k<4; k++){
                int[] nextRed = move(cur.redX, cur.redY, k);
                int[] nextBlue = move(cur.blueX, cur.blueY, k);

                if(grid[nextBlue[0]][nextBlue[1]] == 'O'){
                    continue;
                }

                if(nextRed[0]==nextBlue[0] && nextRed[1]==nextBlue[1]) {
                    int redDist = Math.abs(nextRed[0] - cur.redX) + Math.abs(nextRed[1] - cur.redY);
                    int blueDist = Math.abs(nextBlue[0] - cur.blueX) + Math.abs(nextBlue[1] - cur.blueY);
                    if(redDist > blueDist){
                        nextRed[0] -= dx[k];
                        nextRed[1] -= dy[k];
                    } else{
                        nextBlue[0] -= dx[k];
                        nextBlue[1] -= dy[k];
                    }
                }
                Node nextState = new Node(nextRed[0], nextRed[1], nextBlue[0], nextBlue[1], cur.cnt + 1);
                if (!visited.contains(nextState.toKey())) {
                    visited.add(nextState.toKey());
                    queue.add(nextState);
                }
            }
        }
        return 0;
    }
}