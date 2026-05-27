import java.util.*;
class PG_181844 {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int n : arr){
            answer.add(n);
        }
        for(int n : delete_list){
            answer.remove(Integer.valueOf(n));
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> delete = new ArrayList<>();
        for(int n : delete_list){
            delete.add(n);
        }
        for(int n : arr){
            if(!delete.contains(n)){
                answer.add(n);
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}
*/