import java.util.*;

class PG_42583_R4 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Queue<Integer> waitQ = new ArrayDeque<>();
        Queue<Integer> bridgeQ = new ArrayDeque<>();
        for(int t : truck_weights){
            waitQ.add(t);
        }
        for(int i=0; i<bridge_length; i++){
            bridgeQ.add(0);
        }
        int cur_weight = 0;
        while(!bridgeQ.isEmpty()){
            time++;
            cur_weight -= bridgeQ.poll();
            if(!waitQ.isEmpty()){
                if(cur_weight + waitQ.peek() <= weight){
                    int truck = waitQ.poll();
                    cur_weight += truck;
                    bridgeQ.add(truck);
                } else{
                    bridgeQ.add(0);
                }
            }
        }
        return time;
    }
}