import java.util.*;
class PG_181916 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        if(dice[0]==dice[3]){
            return dice[0] * 1111;
        } else if(dice[0]==dice[2] || dice[1]==dice[3]){
            return (int)Math.pow(10*dice[1] + (dice[0]+dice[3]-dice[1]), 2);
        } else if(dice[0]==dice[1] && dice[2]==dice[3]){
            return (dice[0] + dice[3]) * (dice[3]-dice[0]);
        } else if(dice[0]==dice[1] && dice[2] != dice[3]){
            return dice[2] * dice[3];
        } else if(dice[1]==dice[2] && dice[0] != dice[3]){
            return dice[0] * dice[3];
        } else if(dice[2]==dice[3] && dice[0] != dice[1]){
            return dice[0] * dice[1];
        } else{
            return dice[0];
        }
    }
}
/*
import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] num = {a, b, c, d};
        for(int n : num){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        if(map.size()==1){
            return 1111 * a;
         } else if(map.size()==2){
            int p = list.get(0);
            int q = list.get(1);
            if(map.get(p)==3){
                return (int)Math.pow(10*p+q, 2);
            } else if(map.get(q)==3){
                return (int)Math.pow(10*q+p, 2);
            } else{
                return (p+q) * Math.abs(p-q);
            }
        } else if(map.size()==3){ // p p, q, r
            int answer = 1;
            for(int l : list){
                if(map.get(l)==1){
                    answer *= l;
                }
            }
            return answer;
        } else{
            return Collections.min(list);
        }
    }
}
 */