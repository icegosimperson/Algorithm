import java.util.*;
class PG_84021_R3 {
    class Node implements Comparable<Node>{
        int x, y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Node o){
            if(this.x == o.x){
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }
    public int solution(int[][] game_board, int[][] table) {
        int answer = 0;
        int N = game_board.length;
        List<List<Node>> boardList = new ArrayList<>();
        List<List<Node>> tableList = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(game_board[i][j]==0){
                    boardList.add(normalize(getPiece(i, j, game_board, 0)));
                }
                if(table[i][j]==1){
                    tableList.add(normalize(getPiece(i, j, table, 1)));
                }
            }
        }
        boolean[] visited = new boolean[tableList.size()];
        for(List<Node> boardPiece : boardList){
            for(int i=0; i<tableList.size(); i++){
                List<Node> tablePiece = tableList.get(i);
                boolean isMatch = false;
                if(visited[i]) {
                    continue;
                }
                for(int r=0; r<4; r++){
                    if(isSame(boardPiece, tablePiece)){
                        visited[i] = true;
                        isMatch = true;
                        answer += boardPiece.size();
                        break;
                    }
                    tablePiece = rotate(tablePiece);
                }
                if(isMatch) break;
            }
        }
        return answer;
    }
    public List<Node> rotate(List<Node> piece){
        List<Node> rotated = new ArrayList<>();
        for(Node n : piece){
            rotated.add(new Node(n.y, -n.x));
        }
        return normalize(rotated);
    }
    public boolean isSame(List<Node> a, List<Node> b){
        if(a.size() != b.size()) return false;
        for(int i=0; i<a.size(); i++){
            if(a.get(i).x != b.get(i).x || a.get(i).y != b.get(i).y){
                return false;
            }
        }
        return true;
    }
    public List<Node> normalize(List<Node> piece){
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for(Node n : piece){
            minX = Math.min(n.x, minX);
            minY = Math.min(n.y, minY);
        }
        for(Node n : piece){
            n.x -= minX;
            n.y -= minY;
        }
        Collections.sort(piece);
        return piece;
    }
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public List<Node> getPiece(int x, int y, int[][] map, int target){
        int N = map.length;
        List<Node> piece = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        map[x][y] = (target==1 ? 0 : 1);
        piece.add(new Node(x, y));
        q.add(new Node(x, y));
        while(!q.isEmpty()){
            Node cur = q.poll();
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(nx>=0 && nx<N && ny>=0 && ny<N && map[nx][ny]==target){
                    map[nx][ny] = (target==1 ? 0 : 1);
                    piece.add(new Node(nx, ny));
                    q.add(new Node(nx, ny));
                }
            }
        }
        return piece;
    }
}