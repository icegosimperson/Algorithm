/*
가장 많이 맞춘 사람 번호 출력

1번 : 1, 2, 3, 4, 5 순회
2번 : (2, 1) (2, 3), (2, 4), (2, 5) 순회
3번 : (3, 3), (1, 1), (2, 2), (4, 4), (5, 5) 순회

repeat() -> String만 가능 
Arraysfill(array, value), Math.max(max, value) 다중값 불가

*/
import java.util.*;

class PG_42840 {
    public int[] solution(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int p1Cnt = 0, p2Cnt =0, p3Cnt=0;

        for(int i=0; i<answers.length; i++){
            if(answers[i] == pattern1[i % pattern1.length]) p1Cnt++;
            if(answers[i] == pattern2[i % pattern2.length]) p2Cnt++;
            if(answers[i] == pattern3[i % pattern3.length]) p3Cnt++;
        }

        int max = Integer.MIN_VALUE;
        max = Math.max(Math.max(p1Cnt, p2Cnt), p3Cnt); // Arrays.stream(new int[]{p1Cnt, p2Cnt, p3Cnt}).max().getAsInt();

        int size = 0;
        if(p1Cnt==max) size++;
        if(p2Cnt==max) size++;
        if(p3Cnt==max) size++;

        int[] answer = new int[size]; // 1 or 2 or 3
        int idx = 0;
        if(p1Cnt==max) answer[idx++] = 1;
        if(p2Cnt==max) answer[idx++] = 2;
        if(p3Cnt==max) answer[idx++] = 3;

        return answer;
    }
}