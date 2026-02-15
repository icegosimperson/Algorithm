import java.util.List;

class LT_841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);

        for(boolean v : visited){
            if(!v){
                return false;
            }
        }
        return true;
    }
    private static void dfs(int room, List<List<Integer>> rooms, boolean[] visited){
        visited[room] = true;
        List<Integer> keys = rooms.get(room);
        for(int key : rooms.get(room)){
            if(!visited[key]){
                dfs(key, rooms, visited);
            }
        }
    }
}

/*
for(int i=0; i<keys.size(); i++){
            int key = keys.get(i);
            if(!visited[key]){
                dfs(key, rooms, visited);
            }
        }

## 문제 파악

?? 문제 이해를 못함

## 접근 방법

각 방안에 있는 열 쇠들

rooms[i] : i번 방 안에 있는 열쇠들 리스트

모든 방을 방문할 수 있으면 true, 아니면 false 반환

각 방 (Node) → 열쇠를 통해 갈 수 있는 방 (edge) → 그래프 탐색 → dfs

## 배우게 된 점

매번 배열만 사용하다가 이차원 리스트를 보고 당황했던 문제이다

List<List<Integer>> rooms는 **이차원 리스트 (2차원 배열처럼 동작하는 구조)**

향상된 for 문 쓰기.. 

프로그래머스랑 리트코드에서 푸는게 낯설다 ㅠ

*/