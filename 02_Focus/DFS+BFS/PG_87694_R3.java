/*
1) '도형의 이동 조건'을 코드로 어떻게 구현할지 몰라 초기 설정부터 막힘
- 캐릭터가 이동할 때마다 실시간으로 이 좌표가 사각형의 테두리인지, 어떤 사각형의 내부에 속해있는지 일일이 체크하며 움직여야 한다"고 생각

2) 이동할 때 판단하는 게 아니라, "이동하기 전"에 미리 완벽한 '지도(Map)'를 그려놓는 문제
- 사각형 정보를 이용해 갈 수 있는 길(1)과 못 가는 벽(-1)을 배열에 미리 다 그려둬서,
- 이후엔 도형 조건 신경 쓸 필요 없이 일반 미로 찾기(BFS)와 동일

3) 이유
- "좌표 2배 확대": (3,4)와 (3,5)처럼 테두리가 인접해 있을 때, 1배수 좌표에서는
- 사이가 비어있음에도 불구하고 상하좌우 탐색 시 바로 옆 칸으로 인식해 '점프'하는 오류 발생.
 => 2배를 하면 중간에 빈칸이 생겨서 테두리를 따라 돌아가게 강제O
- "내부 파내기": 여러 사각형이 겹칠 때, 어떤 사각형의 테두리라도 다른 사각형의 '안쪽'에 해당 -> 이동 경로X
 => 따라서 사각형 내부를 -1(벽)로 밀어버리면 가장 바깥쪽 외곽선만 남게 됨.
*/
import java.util.*;

class Solution {
    private static class Node{
        int x, y, dist;
        Node(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] board = new int[102][102];
        for(int[] r : rectangle){
            int x1 = r[0]*2; int y1 = r[1]*2;
            int x2 = r[2]*2; int y2 = r[3]*2;
            for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    if(board[i][j]==-1) continue;

                    if(i==x1 || i==x2 || j==y1 || j==y2){
                        board[i][j] = 1;
                    } else{
                        board[i][j] = -1;
                    }
                }
            }
        }
        return bfs(board, characterX*2, characterY*2, itemX*2, itemY*2)/2;
    }
    public int bfs(int[][] board, int startX, int startY, int targetX, int targetY){
        Queue<Node> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[102][102];
        queue.add(new Node(startX, startY, 0));
        visited[startX][startY] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.x==targetX && cur.y==targetY){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(nx>=0 && nx<102 && ny>=0 && ny<102){
                    if(!visited[nx][ny] && board[nx][ny]==1){
                        queue.add(new Node(nx, ny, cur.dist+1));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return 0;
    }
}