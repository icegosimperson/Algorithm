import java.util.*;
class PG_181894 {
    public int[] solution(int[] arr) {
        int min = -1; int max = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                if(min==-1){
                    min = i;
                }
                max = i;
            }
        }
        if(min==-1) return new int[]{-1};
        return Arrays.copyOfRange(arr, min, max+1);
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                min = Math.min(i, min);
                max = Math.max(i, max);
            }
        }
        if(min==max){
            answer.add(arr[min]);
        } else if(min==Integer.MAX_VALUE){
            answer.add(-1);
        } else{
            for(int i=min; i<=max; i++){
                answer.add(arr[i]);
            }
        }
        // 1. arr 순회
        // 2. 첫번째 2 발견
        // 3. 마지막 2 발견
            // if) 2가 2개인 경우
            // else if) 2가 1개인 경우
            // else) 2존재 x
        return answer.stream().mapToInt(x->x).toArray();
    }
}
*/