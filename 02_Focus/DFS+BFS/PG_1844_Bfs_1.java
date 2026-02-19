/*
1) 알고리즘 유형: Bfs
    - 이유: 4방향 모두 탐색하며 한칸 씩 이동하는 최단거리를 구하는 문제
            (1, 1) -> (n, m) 도착 최단거리
2) 시간 복잡도: O(NxM) = 100 x 100 = 10,000
3) 배운점
- 시작점 인덱스: (1, 1) 시작 (배열 범위 초과 위험) => (0, 0) 시작 (배열 인덱스 체계 이해)
- 최단 거리 측정: answer++ (전체 탐색 횟수 합산) => Node.dist 또는 maps[nx][ny] 누적 (경로별 거리 관리)
- 종료 및 반환: while문 종료 후 단순 체크 => 목적지 도달 즉시 반환 (BFS의 최단거리 보장성 활용)
- 자료구조: int[]로 좌표 저장 or Node 객체로 상태(좌표+거리) 구조화
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
    public int solution(int[][] maps) {
        int N = maps.length; // 가로
        int M = maps[0].length;  // 세로
        boolean[][] visited = new boolean[N][M]; // 다음부터 [r][c]로 선언
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(new Node(0, 0, 1));
        visited[0][0] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.x==N-1 && cur.y==M-1){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(nx>=0 && nx<N && ny>=0 && ny<M){
                    if(!visited[nx][ny] && maps[nx][ny]==1){  // 이동 가능한 경우
                        visited[nx][ny] = true;
                        queue.add(new Node(nx, ny, cur.dist+1)); // 이동 가능시 큐에 추가

                    }
                }
            }
        }
        return -1;
    }
}