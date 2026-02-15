/*
사과 상태 : 1~K점
가격 : 가장 낮은 점수(p)  * 한 상자에 담기는 개수(m) = pm(가격)

ex k=3, 1~3점 m=4(max=4)
[1, 2, 3, 1, 2, 3, 1] => 1*4=4(가격), 

sum += Arrays의 min x 상자.length + () + ()
return 사과 장수 최대 이익

[1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4]
*/
import java.util.*;
class PG_135808 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i=score.length-m; i>=0; i-=m){
            answer += score[i] * m;
        }
        return answer;
    }
}


/*
내림차순 정렬
        Integer[] arr = Arrays.stream(score)
                                .boxed()
                                .toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
*/