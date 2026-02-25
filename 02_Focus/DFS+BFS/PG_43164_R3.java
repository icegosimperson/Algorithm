import java.util.*;

class PG_43164_R3 {
    static boolean[] visited;
    static ArrayList<String> list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        Arrays.sort(tickets, (a, b)->a[1].compareTo(b[1]));
        dfs("ICN", "ICN", 0, tickets);
        return list.get(0).split(" ");
    }
    public void dfs(String cur, String path, int count, String[][] tickets){
        if(count==tickets.length){
            list.add(path);
            return;
        }
        for(int i=0; i<tickets.length; i++){
            if(!visited[i] && cur.equals(tickets[i][0])){
                visited[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], count+1, tickets);
                visited[i] = false;
            }
        }
    }
}