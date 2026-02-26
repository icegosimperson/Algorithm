/*
추출: 보드랑 테이블에서 덩어리를 따로 떼어내자. -> List<Node> (덩어리)
정렬: 같은 모양인데 좌표가 다르면? -> (0,0)으로 옮기기(정규화)
보관: 덩어리가 여러 개니까? -> List<List<Node>> (바구니)

1. 보드에서 빈칸 다 뽑아서 빈칸_바구니에 넣자.
2. 테이블에서 조각 다 뽑아서 조각_바구니에 넣자.
3. 빈칸_바구니에서 구멍 하나 꺼내고,
4. 조각_바구니에서 조각 하나 꺼내서,
5. "0도일 때 맞아? 90도는? 180도는? 270도는?" 하고 다 물어보자.
6. 맞으면 점수 올리고 조각은 버리기.
*/
import java.util.*;
class PG_84021_R2 {
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
        List<List<Node>> boardList = new ArrayList<>(); // 1. 보드의 빈칸들 뽑기 (List<List<Node>>)
        List<List<Node>> tableList = new ArrayList<>(); // 2. 테이블의 조각들 뽑기 (List<List<Node>>)
        int n = game_board.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(game_board[i][j]==0){
                    boardList.add(normalize(getPiece(i, j, game_board, 0)));
                }
                if(table[i][j]==1){
                    tableList.add(normalize(getPiece(i, j, table, 1)));
                }
            }
        }
        // 3. 비교하며 answer 계산하기
        boolean[] visited = new boolean[tableList.size()];
        for(List<Node> boardPiece : boardList){
            for(int i=0; i<tableList.size(); i++){
                if(visited[i]){
                    continue;
                }
                List<Node> tablePiece = tableList.get(i);
                boolean isMatch = false;
                for(int r=0; r<4; r++){
                    if(isSame(boardPiece, tablePiece)){
                        answer += boardPiece.size();
                        visited[i] = true;
                        isMatch = true;
                        break;
                    }
                    tablePiece = rotate(tablePiece);
                }
                if(isMatch){
                    break;
                }
            }
        }
        return answer;
    }
    // [필요한 기능들]
    // A. BFS로 덩어리 가져오기 (getPiece)
    public List<Node> getPiece(int x, int y, int[][] map, int target){
        List<Node> piece = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int N = map.length;
        q.add(new Node(x, y));
        piece.add(new Node(x, y));
        map[x][y] = (target==1 ? 0 : 1);

        while(!q.isEmpty()){
            Node cur = q.poll();
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(nx>=0 && nx < N && ny>=0 && ny < N && map[nx][ny]==target){
                    map[nx][ny] = (target==1 ? 0: 1);
                    Node next = new Node(nx, ny);
                    q.add(next);
                    piece.add(next);
                }
            }
        }
        return piece;
    }
    // B. (0,0)으로 옮기고 정렬하기 (normalize)
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
    // C. 90도 돌리기 (rotate)
    public List<Node> rotate(List<Node> piece){
        List<Node> rotated = new ArrayList<>();
        for(Node n : piece){
            rotated.add(new Node(n.y, -n.x)); // (x, y) -> (y, -x)
        }
        return normalize(rotated);
    }
    // D. 두 조각이 같은지 확인하기 (isSame)
    public boolean isSame(List<Node> a, List<Node> b){
        if(a.size() != b.size()){
            return false;
        }
        for(int i=0; i<a.size(); i++){
            if(a.get(i).x != b.get(i).x || a.get(i).y != b.get(i).y){
                return false;
            }
        }
        return true;
    }
}