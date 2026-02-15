import java.util.*;
class PG_42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<bridge_length; i++){
            deque.add(0); // [0, 0]
        }
        int time = 0;
        int curWeight = 0;
        int truckIdx = 0;
        while(truckIdx < truck_weights.length){
            time++;
            curWeight -= deque.poll();
            if(curWeight + truck_weights[truckIdx] <= weight){
                deque.add(truck_weights[truckIdx]);
                curWeight += truck_weights[truckIdx];
                truckIdx++;
            } else deque.add(0);
        }
        return time + bridge_length;
    }
}