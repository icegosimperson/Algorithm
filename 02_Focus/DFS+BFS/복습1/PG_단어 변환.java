import java.util.*;
class PG_단어 변환 {
    class Node{
        String word; int cnt;
        Node(String word, int cnt){
            this.word = word;
            this.cnt = cnt;
        }
    }
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(begin, 0));
        while(!q.isEmpty()){
            Node cur = q.poll();
            if(cur.word.equals(target)){
                return cur.cnt;
            }
            for(int i=0; i<words.length; i++){
                if(!visited[i] && canChange(cur.word, words[i])){
                    visited[i] = true;
                    q.add(new Node(words[i], cur.cnt+1));
                }
            }
        }
        return 0;
    }
    public boolean canChange(String a, String b){
        int diff = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)!=b.charAt(i)){
                diff++;
            }
        }
        return diff==1;
    }
}