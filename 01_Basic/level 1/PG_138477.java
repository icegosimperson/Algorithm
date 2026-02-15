/*
k번째 일까지는 명예 전당 in
        k번째 순위의 가수보다 점수가 높으면 명예의 전당에 오름, k번째 순위 점수는 명예의 전당에서 내려옴

        - 안에 오름 차순으로 정렬되는게 중요한가?
        - 자료구조의 사용 : Stack -> 내부 정렬 어려움, TreeSet : 중복 허용x, PQ?
        ArrayList + sort가 나을듯
*/
import java.util.*;

class PG_138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> lists = new ArrayList<>(score.length);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<score.length; i++){
            if(i<=k-1){ // k일까지 명예의 전당 올림 (0, 1, 2)
                lists.add(score[i]); // 10, 100, 20 
                min = Math.min(score[i], min); // ans = 10, 10, 10
                answer[i] = min;
                continue;
            }
            lists.add(score[i]);

            Collections.sort(lists, Collections.reverseOrder());

            if(lists.size() > k){
                lists.remove(k);
            }
            answer[i] = lists.get(lists.size()-1);
        }
        return answer;
    }
}

/* 우선순위 큐 사용
import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<score.length; i++){
            pq.add(score[i]);
            if(pq.size() > k){
                pq.poll();
            }
            answer[i]=pq.peek();
        }
        return answer;
    }
}
*/