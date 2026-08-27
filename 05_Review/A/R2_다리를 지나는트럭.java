import java.util.*;
class R2_다리를 지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;
        int time =0;
        Queue<Integer> waitQ = new ArrayDeque<>();
        Queue<Integer> bridgeQ = new ArrayDeque<>();
        for(int i=0; i<bridge_length; i++) bridgeQ.add(0);
        for(int t : truck_weights) waitQ.add(t);
        while(!waitQ.isEmpty()){
            time++;
            sum -= bridgeQ.poll();
            if(sum + waitQ.peek() <=weight){
                int t = waitQ.poll();
                sum += t;
                bridgeQ.add(t);
            }else{
                bridgeQ.add(0);
            }
        }

        return time + bridge_length;
    }
}