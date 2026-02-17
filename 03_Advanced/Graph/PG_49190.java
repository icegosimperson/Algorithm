import java.util.*;

class PG_49190 {
    int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    public int solution(int[] arrows) {
        int answer = 0;
        Set<String> nodes = new HashSet<>();
        Set<String> edges = new HashSet<>();
        nodes.add("0,0");
        int x=0, y = 0;
        for(int arrow : arrows){
            for(int i=0; i<2; i++){
                int nx = x + dx[arrow];
                int ny = y + dy[arrow];
                String nowNode = x + "," + y;
                String nextNode = nx + "," + ny;
                String edges1 = nowNode + "->" + nextNode;
                String edges2 = nextNode + "->" + nowNode;
                if(nodes.contains(nextNode)){
                    if(!edges.contains(edges1) && !edges.contains(edges2)){
                        answer++;
                    }
                }
                nodes.add(nextNode);
                edges.add(edges1);
                edges.add(edges2);
                x=nx;
                y=ny;
            }
        }
        return answer;
    }
}