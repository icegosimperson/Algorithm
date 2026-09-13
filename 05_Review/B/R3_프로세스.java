import java.util.*;
class R3_프로세스 {
    public class Process{
        int prior=0;
        int index=0;
        public Process(int prior, int index){
            this.prior = prior;
            this.index = index;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer=0; // 실행순서
        ArrayDeque<Process> queue = new ArrayDeque<>();
        for(int i=0; i<priorities.length; i++){
            queue.add(new Process(priorities[i], i));
        }
        while(!queue.isEmpty()){
            Process cur = queue.poll();
            boolean isHigher = false;
            for(Process p : queue){
                if(p.prior > cur.prior){
                    isHigher = true;
                    break;
                }
            }
            if(isHigher){
                queue.add(cur);
            }else{
                answer++;
                if(cur.index==location){
                    return answer;
                }
            }
        }
        return 0;
    }
}
// import java.util.*;
// class Solution {
//     // 1) 큐 2개 사용
//     // 2) 객체 사용 후
//         // 우선순위 별로 정렬(오름차순)
//     public class Process(){
//         int prior=0;
//         int index=0;
//         public Process(int prior, int index){
//             this.prior = prior;
//             this.index = index;
//         }
//         // @Override
//         // public int compareTo(Process p){
//         //     // prior 내림차순부터 반환
//         //         // prior가 같을 시 index 순서........인데 음; 아 정렬하는거 아닌거같은데 ㅠ
//         // }
//     }
//     public int solution(int[] priorities, int location) {
//         // priorities 원소 안에 있는 최댓값(우선순위가 가장 큰 것)을 어떻게 처음부터 알고 대기큐에 넣지??;;;
//         int answer = 0;
//         ArrayDeque<Process> queue = new ArrayDeuqe<>();
//         for(int i=0; i<priorities.length; i++){
//             queue.add(new Process(priorities[i], i));
//         }
//         // 우선순위 높은게 높음
//         while(!queue.isEmpty()){
//             Process cur = queue.poll();
//             if(cur.prior<queue.peek().prior){
//                 // 실행 시작
//                 answer++; // 실행 시킨 위치를 어떻게 저장하지;;
//                 continue;
//             }
//             queue.add(cur);
//         }
//         // 실행 조건 : 우선순위가 높은 것 부터,
//             // 우선순위가 낮은게 왔을 경우 -> 대기 큐를 꺼내서, 다시 대기 큐에 집어넣음
//                 // 큐 두개할 경우, 어떻게 대기 큐에 있는 우선순위가 뒤에 우선순위보다 큰지 어떻게 확인..하지

//         return answer; // location위치에 있는 프로세스가 실행된 순서(인덱스 주의)
//     }
// }