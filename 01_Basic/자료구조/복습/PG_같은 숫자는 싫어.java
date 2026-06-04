import java.util.*;

public class PG_같은 숫자는 싫어 {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int flag = -1;
        for(int n : arr){
            if(n!=flag){
                answer.add(n);
            }
            flag = n;
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}