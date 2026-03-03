import java.util.*;

public class PG_12906_R4 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = -1;
        for(int i : arr){
            if(prev!=i){
                list.add(i);
                prev = i;
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}