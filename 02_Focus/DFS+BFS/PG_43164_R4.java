import java.util.*;
class PG_43164_R4 {
    static Map<String, PriorityQueue<String>> map = new HashMap<>(); // 지금 내 위치에서 갈 수 있는 다음 길을 헤매지 않고 즉시 찾기
    static ArrayList<String> list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        for(String[] ticket : tickets){
            map.putIfAbsent(ticket[0], new PriorityQueue<>());
            map.get(ticket[0]).add(ticket[1]);
        }
        dfs("ICN");
        Collections.reverse(list);
        return list.toArray(new String[0]); // 길이가 0인 빈 배열을 새로 만듦
    }
    public void dfs(String cur){
        while(map.containsKey(cur) && !map.get(cur).isEmpty()){
            dfs(map.get(cur).poll());
        }
        list.add(cur);
    }
}