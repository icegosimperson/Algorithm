import java.util.*;

class PG_42628 {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        // 문자열 분리 -> 명령어, 값 
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        for(String op : operations){
            String[] split = op.split(" ");
            String command = split[0];
            int num = Integer.parseInt(split[1]);
            if(command.equals("I")){
                minPq.offer(num);
                maxPq.offer(num);
            }else{
                if(maxPq.isEmpty()) continue;

                if(num==1){
                    minPq.remove(maxPq.poll());
                } else{
                    maxPq.remove(minPq.poll());
                }
            }
        }
        if(maxPq.isEmpty() && minPq.isEmpty()) {
            return new int[]{0, 0};
        }
        return new int[]{maxPq.peek(), minPq.peek()};
    }
}