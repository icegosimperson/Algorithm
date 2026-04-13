import java.util.*;
class PG_43165 {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }
    public int dfs(int[] numbers, int cur, int index, int target){
        if(index==numbers.length){
            return cur == target ? 1 : 0;
        }
        return dfs(numbers, cur+numbers[index], index+1, target)
                + dfs(numbers, cur-numbers[index], index+1, target);
    }
}