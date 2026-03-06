import java.util.*;
class PG_42628_R2 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        for(String o : operations){
            String[] split = o.split(" ");
            String command = split[0];
            int number = Integer.parseInt(split[1]);
            if(command.equals("I")){
                minQ.add(number);
                maxQ.add(number);
            } else{
                if(maxQ.isEmpty()) continue;
                if(number==1){
                    minQ.remove(maxQ.poll());
                } else{
                    maxQ.remove(minQ.poll());
                }
            }
        }
        if(minQ.isEmpty() && maxQ.isEmpty()) return new int[]{0, 0};
        return new int[]{maxQ.peek(), minQ.peek()};
    }
}