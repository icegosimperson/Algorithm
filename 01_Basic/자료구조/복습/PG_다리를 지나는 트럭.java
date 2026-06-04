import java.util.*;
class PG_다리를 지나는 트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Deque<Integer> bridgeQ = new ArrayDeque<>();
        Deque<Integer> truckQ = new ArrayDeque<>();
        for(int truck : truck_weights){
            truckQ.add(truck);
        }
        for(int i=0; i<bridge_length; i++){
            bridgeQ.add(0);
        }
        int cur_weight = 0;
        while(!bridgeQ.isEmpty()){
            time++;
            cur_weight -= bridgeQ.poll();
            if(!truckQ.isEmpty()){
                if(truckQ.peek() + cur_weight <= weight){
                    int truck = truckQ.poll();
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