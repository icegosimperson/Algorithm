import java.util.*;
class PG_42628 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        for(String o : operations){
            String[] s = o.split(" ");
            String command = s[0];
            int num = Integer.parseInt(s[1]);
            if(command.equals("I")){
                minQ.offer(num);
                maxQ.offer(num);
            } else{
                if(minQ.isEmpty() || maxQ.isEmpty()) continue;
                if(num==1){
                    minQ.remove(maxQ.poll());
                } else{
                    maxQ.remove(minQ.poll());
                }
            }
        }
        if(maxQ.isEmpty() && minQ.isEmpty()){
            return new int[]{0, 0};
        }
        return new int[]{maxQ.peek(), minQ.peek()};
    }
}