import java.util.*;
class PG_43164_R2 {
    Map<String, PriorityQueue<String>> map = new HashMap<>();
    LinkedList<String> answer = new LinkedList<>();
    public String[] solution(String[][] tickets) {
        for(String[] ticket : tickets){
            map.putIfAbsent(ticket[0], new PriorityQueue<>());
            map.get(ticket[0]).add(ticket[1]);
        }
        dfs("ICN");
        return answer.toArray(new String[0]);
    }
    public void dfs(String cur){
        while(map.containsKey(cur) && !map.get(cur).isEmpty()){
            dfs(map.get(cur).poll());
        }
        answer.addFirst(cur);
    }
}