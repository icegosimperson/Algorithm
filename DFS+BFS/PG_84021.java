import java.util.*;

class PG_84021 {
    int N;
    List<String> blank = new ArrayList<>();
    private static class Node{
        int r, c;
        Node(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    public int solution(int[][] game_board, int[][] table) {
        N = game_board.length;
        boolean[][] visited = new boolean[N][N];
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j] && game_board[i][j]==0){
                    blank.add(extract(game_board, i, j, 0, visited));
                }
            }
        }
        boolean[][] visitedTable = new boolean[N][N];
        int answer = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visitedTable[i][j] && table[i][j]==1){
                    String puzzle = extract(table, i, j, 1, visitedTable);
                    answer += match(puzzle);
                }
            }
        }
        return answer;
    }
    public int match(String puzzle){
        for(int i=0; i<blank.size(); i++){
            String target = blank.get(i);
            String temp = puzzle;
            for(int r=0; r<4; r++){
                if(target.equals(temp)){
                    blank.remove(i);
                    return Integer.parseInt(temp.split(":")[0]);
                }
                temp = rotate(temp);
            }
        }
        return 0;
    }
    public String rotate(String s){
        String[] part = s.split(":");
        String count = part[0];
        String shapeStr = part[1];

        String[] rows = shapeStr.split(",");
        int r = rows.length;
        int c = rows[0].length();
        boolean[][] origin = new boolean[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                origin[i][j] = rows[i].charAt(j) == '1';
            }
        }
        boolean[][] rotated = new boolean[c][r]; // 90도 회전
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                rotated[j][r-1-i] = origin[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                sb.append(rotated[i][j] ? "1" : "0");
            }
            sb.append(",");
        }
        return count + ":" + sb.toString();
    }
    public String extract(int[][] board, int r, int c, int target, boolean[][] visited){
        Queue<Node> q = new ArrayDeque<>();
        List<Node> points = new ArrayList<>();
        int minR = r, maxR = r, minC = c, maxC = c;

        q.add(new Node(r, c));
        points.add(new Node(r, c));
        visited[r][c] = true;

        while(!q.isEmpty()){
            Node cur = q.poll();
            for(int k=0; k<4; k++){
                int nr = cur.r + dr[k];
                int nc = cur.c + dc[k];
                if(nr>=0 && nr<N && nc>=0 && nc<N && !visited[nr][nc] && board[nr][nc]==target){
                    visited[nr][nc] = true;
                    q.add(new Node(nr, nc));
                    points.add(new Node(nr, nc));
                    minR = Math.min(minR, nr); maxR = Math.max(maxR, nr);
                    minC = Math.min(minC, nc); maxC = Math.max(maxC, nc);
                }
            }
        }
        int rowLen = maxR - minR + 1;
        int colLen = maxC - minC + 1;

        boolean[][] shape = new boolean[rowLen][colLen];
        for (Node p : points) {
            shape[p.r - minR][p.c - minC] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                sb.append(shape[i][j] ? "1" : "0");
            }
            sb.append(",");
        }
        return points.size() + ":" + sb.toString();
    }
}