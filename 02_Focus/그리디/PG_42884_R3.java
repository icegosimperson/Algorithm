/*
routes[i][0]에는 i번째 차량이 고속도로에 진입한 지점,
routes[i][1]에는 i번째 차량이 고속도로에서 나간 지점

[-20, -15], [-18, -13], [-14. -5], [-5, -3]

*/
import java.util.*;
class PG_42884_R3 {
    public int solution(int[][] routes) {
        int answer = 0;
        int camera = Integer.MIN_VALUE; // 현재 카메라 위치
        Arrays.sort(routes, (a, b)->a[1]-b[1]);
        for(int[] route : routes){
            int start = route[0];
            int end = route[1];
            if(start > camera){
                answer++;
                camera = end;
            }
        }
        return answer; // 최소 몇 대의 카메라를 설치
    }
}