/*
처음에는 Bfs 유형으로 풀 수 없을거라 생각했는데, 실제로는 가능했다.
차이는 최단거리 구하는 문제가 아니여서 불가능하다고 생각했었는데,
Bfs 유형이 최단거리 뿐만 아니라 [모든 가능한 상태를 level로 확장하며 탐색]할 때도 유용하기 때문이다.

이 문제에서 각 숫자를 더하거나 빼는 선택을 한 level로 보고,
마지막 숫자까지 처리했을 때(마지막 level)의 모든 합계 결과물을 Queue를 통해 수평적으로 확인하는 방식으로 풀이
*/
import java.util.*;
class PG_43165_Bfs {
    public int solution(int[] numbers, int target) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0); // 시작점 합계 : 0
        // boolean[] visited(X) : 중복 합계 가능, 무한 루프 반복x
        for(int num : numbers){
            int size = queue.size(); // 현재 층의 노드 개수
            for(int i=0; i<size; i++){
                int cur = queue.poll();
                queue.add(cur+num);
                queue.add(cur-num);
            }
        }
        int answer = 0;
        while(!queue.isEmpty()){
            if(queue.poll()==target){
                answer++;
            }
        }
        return answer;
    }
}