import java.util.*;
class PG_181921 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=l; i<=r; i++){
            String num = String.valueOf(i);
            if(num.matches("^[05]+$")){
                answer.add(i);
            }
        }
        if(answer.size()==0) answer.add(-1);
        return answer.stream().mapToInt(x->x).toArray();
    }
}