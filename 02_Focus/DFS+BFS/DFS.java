import java.util.*;

public class DFS {
    // visited를 set으로 구현
    public void dfs(List<List<Integer>> graph, Set<Integer> visited, int curVertex) {
        // ===== 코드 구현 =====
        visited.add(curVertex);
        System.out.print(curVertex + " ");
        for(int nextVertex : graph.get(curVertex)){
            if(!visited.contains(nextVertex)){
                dfs(graph, visited, nextVertex);
            }
        }
    }

    // visited를 array로 구현
    public void dfs(List<List<Integer>> graph, boolean[] visited, int curVertex) {
        // ===== 코드 구현 =====
        visited[curVertex] = true;
        System.out.print(curVertex + " ");
        for(int nextVertex : graph.get(curVertex)){
            if(!visited[nextVertex]){
                dfs(graph, visited, nextVertex);
            }
        }
        // ===================
    }
    public void dfs(List<List<Integer>> graph, Map<Integer, Boolean> visited, int curVertex) {
        visited.put(curVertex, true); // 방문 체크
        System.out.print(curVertex + " "); // 방문 시 출력

        for (int nextVertex : graph.get(curVertex)) {
            if (!visited.getOrDefault(nextVertex, false)) { // 방문 안한 경우
                dfs(graph, visited, nextVertex);
            }
        }
    }
    public void solve(List<List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        dfs(graph, new HashSet<>(), 0);
        System.out.println();
        dfs(graph, new boolean[graph.size()], 0);
        System.out.println();
        Map<Integer, Boolean> visitedMap = new HashMap<>();
        dfs(graph, visitedMap, 0);
    }

    // 실행용 메소드
    public static void main(String[] args) {
        (new DFS()).solve(makeGraph());
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
