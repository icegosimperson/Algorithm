import java.util.*;
class PG_42583_R4 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridgeQ = new ArrayDeque<>();
        Queue<Integer> truckQ = new ArrayDeque<>();
        for(int i=0; i<bridge_length; i++){
            bridgeQ.add(0);
        }
        for(int t : truck_weights){
            truckQ.add(t);
        }
        int cur_weight = 0;
        while(!bridgeQ.isEmpty()){
            answer++;
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
        return answer;
    }
}