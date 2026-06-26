import java.util.*;
class 649_Dota2 Senate {
    public String predictPartyVictory(String senate) {
        ArrayDeque<Integer> rQueue = new ArrayDeque<>();
        ArrayDeque<Integer> dQueue = new ArrayDeque<>();
        int n=senate.length();
        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R'){
                rQueue.add(i);
            } else{
                dQueue.add(i);
            }
        }
        while(!rQueue.isEmpty() && !dQueue.isEmpty()){
            int rIdx=rQueue.poll();
            int dIdx=dQueue.poll();
            if(rIdx<dIdx){
                rQueue.add(rIdx+n);
            } else{
                dQueue.add(dIdx+n);
            }
        }
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}