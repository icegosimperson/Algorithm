import java.util.*;

public class PG_12906_R3 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int peek = -1;
        for(int n : arr){
            if(n != peek){
                list.add(n);
                peek = n;
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}