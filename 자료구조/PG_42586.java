import java.util.*;

class PG_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<progresses.length; i++){
            int remain = 100-progresses[i];
            int day = remain / speeds[i];
            if(remain % speeds[i] !=0) day++; // 7
            deque.addLast(day); // 7, 3, 9
        }
        List<Integer> result = new ArrayList<>();
        while(!deque.isEmpty()){
            int standard = deque.pollFirst();
            int cnt = 1;
            while(!deque.isEmpty() && deque.peekFirst() <= standard){
                deque.pollFirst();
                cnt++;
            }
            result.add(cnt);
        }

        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer; // 배포 기능 개수
    }
}