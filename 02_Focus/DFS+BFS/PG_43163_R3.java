/*
처음에는 dfs 유형라 생각했다.
이유는, 가장 짧은 변환 과정을 찾으려면 모든 경우를 비교해야하기 때문이다.
이때 dfs의 재귀탐색으로 탐색할 수 있을 것이라 생각했다.

하지만 bfs로 푸는게 더 효과적이었다.
이유는, bfs는 최단 거리를 보장, 탐색 범위를 최소화 할 수 있기 때문이다.
*/
import java.util.*;
class PG_43163_R3 {
    private static class Node{
        String word; int dist;
        Node(String word, int dist){
            this.word = word;
            this.dist = dist;
        }
    }
    public int solution(String begin, String target, String[] words) {
        Queue<Node> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];
        queue.add(new Node(begin, 0));
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.word.equals(target)){
                return cur.dist;
            }
            for(int i=0; i<words.length; i++){
                if(!visited[i] && convert(cur.word, words[i])){
                    visited[i] = true;
                    queue.add(new Node(words[i], cur.dist+1));
                }
            }
        }
        return 0;
    }
    public boolean convert(String s1, String s2){
        int diff = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                diff++;
            }
        }
        if(diff>1) return false;
        return true;
    }
}