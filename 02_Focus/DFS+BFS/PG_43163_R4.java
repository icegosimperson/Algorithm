import java.util.*;

class PG_43163_R4 {
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
                    queue.add(new Node(words[i], cur.dist+1));
                    visited[i] = true;
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