/*
출발 지점 -> 레버 -> 미로 탈출 문
최단 거리 -> BFS

미로를 탈출 최소 시간 구하기
탈출 못할 경우 -1 반환
*/
import java.util.*;

class PG_159993 {
    private static char[][] board;
    private static boolean[][] visited;
    private static int n, m;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    static class Node{
        int x, y, dist;
        public Node(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        board = new char[n][m];

        for(int i=0; i<n; i++){
            board[i] = maps[i].toCharArray();
        }

        int startX=0, startY = 0;
        int targetX=0, targetY = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]=='S'){
                    startX = i;
                    startY = j;
                } else if(board[i][j]=='L'){ // 레버에 먼저 가야됨
                    targetX = i;
                    targetY = j;
                }
            }
        }
        int toLever = bfs(startX, startY, 'L');
        if(toLever == -1){
            return -1;
        }
        int toEnd = bfs(targetX, targetY, 'E');
        if(toEnd == -1){
            return -1;
        }
        return toLever + toEnd;
    }
    private static int bfs(int s, int e, char checkpoint){
        visited = new boolean[n][m];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(s, e, 0));
        visited[s][e] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(board[cur.x][cur.y] == checkpoint){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(isValid(nx, ny) && !visited[nx][ny] && board[nx][ny]!='X'){
                    queue.offer(new Node(nx, ny, cur.dist+1));
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
    private static boolean isValid(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}