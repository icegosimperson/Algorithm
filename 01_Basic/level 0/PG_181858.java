import java.util.*;
class PG_181858 {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // 순서 보장
        for(int num : arr){
            set.add(num);
            if(set.size()==k){
                break;
            }
        }
        int[] answer = new int[k];
        int idx = 0;
        for(int num : set){
            answer[idx++] = num;
        }
        while(idx<k){
            answer[idx++] = -1;
        }
        return answer;
    }
}