import java.util.*;
class PG_43164 {
    static boolean[] visited;
    static ArrayList<String> graph = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        dfs("ICN", "ICN", tickets, 0);
        return graph.get(0).split(" ");
    }
    public void dfs(String cur, String path, String[][] tickets, int count){
        if(count==tickets.length){
            graph.add(path);
            return;
        }
        for(int i=0; i<tickets.length; i++){
            if(!visited[i] && cur.equals(tickets[i][0])){
                visited[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], tickets, count+1);
                visited[i] = false;
            }
        }
    }
}