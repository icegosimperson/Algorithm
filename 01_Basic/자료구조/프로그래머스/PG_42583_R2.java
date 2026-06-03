import java.util.*;

class PG_42583_R2 {
    static class Truck{
        int weight;
        int exitTime;
        Truck(int weight, int exitTime){
            this.weight = weight;
            this.exitTime = exitTime;
        }
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> bridge = new ArrayDeque<>();
        int curTime = 0;
        int curWeight = 0;
        int truckIdx = 0;

        while(truckIdx < truck_weights.length || !bridge.isEmpty()){
            curTime++;
            if(!bridge.isEmpty() && bridge.peek().exitTime == curTime){
                curWeight -= bridge.poll().weight;
            }
            if(truckIdx < truck_weights.length){
                if(curWeight + truck_weights[truckIdx] <= weight){
                    int exitTime = curTime + bridge_length;
                    curWeight += truck_weights[truckIdx];
                    bridge.add(new Truck(truck_weights[truckIdx], exitTime));
                    truckIdx++;
                } else{
                    curTime = bridge.peek().exitTime-1; // skip
                }
            }
        }
        return curTime;
    }
}