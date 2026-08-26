import java.util.*;
class R2_프로세스 {
    public class Node{
        int prior; int index;
        Node(int prior, int index){
            this.prior = prior;
            this.index = index;
        }
    }
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Node> queue = new ArrayDeque<>();
        for(int i=0; i<priorities.length; i++){
            pq.add(priorities[i]);
            queue.add(new Node(priorities[i], i));
        }
        int answer = 0;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.prior==pq.peek()){
                answer++;
                pq.poll();
                if(cur.index==location){
                    return answer;
                }
            }else{
                queue.add(cur);
            }
        }
        return -1;
    }
}