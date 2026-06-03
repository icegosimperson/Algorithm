import java.util.*;
class PG_42862_R3 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        for(String o : operations){
            String[] split = o.split(" ");
            String command = split[0];
            int value = Integer.parseInt(split[1]);
            if(command.equals("I")){
                minQ.offer(value);
                maxQ.offer(value);
            } else{
                if(maxQ.isEmpty() || minQ.isEmpty()) continue;
                if(value==1){
                    minQ.remove(maxQ.poll());
                } else{
                    maxQ.remove(minQ.poll());
                }
            }
        }
        if(minQ.isEmpty() && maxQ.isEmpty()){
            return new int[]{0, 0};
        }
        return new int[]{maxQ.peek(), minQ.peek()};
    }
}