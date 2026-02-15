import java.util.*;

public class BFS {
    public void bfs(List<List<Integer>> graph, int startVertex) {
        //====== 코드 작성 =====
        Map<Integer, Boolean> visited = new HashMap<>();// 방문 처리
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(startVertex); // 시작점
        visited.put(startVertex, true); // hashmap or array

        while(!queue.isEmpty()){
            int curVertex = queue.poll(); // 방문
            System.out.print(curVertex + " ");
            for(int nextVertex : graph.get(curVertex)){ // 다음노드 예약
                if(!visited.containsKey(nextVertex)){
                    queue.offer(nextVertex);
                    visited.put(nextVertex, true);
                }
            }
        }
        //====================
    }

    public void solve(List<List<Integer>> graph) {
        bfs(graph, 0);
    }

    // 실행용 메소드
    public static void main(String[] args) {
        (new BFS()).solve(makeGraph());
    }

    public static List<List<Integer>> makeGraph() {
        return new ArrayList<>() {{
            add(List.of(1, 3, 6));
            add(List.of(0, 3));
            add(List.of(3));
            add(List.of(0, 1, 2, 7));
            add(List.of(5));
            add(List.of(4, 6, 7));
            add(List.of(0, 5));
            add(List.of(3, 5));
        }};
    }

}