import java.util.*;

class PG_42889 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] cnt = new int[N+2];

        for(int s : stages){
            cnt[s]++; // 각 스테이지별 인원 cnt
        }

        double[] ratio = new double[N+1];
        int total = stages.length;
        for(int i=1; i<=N; i++){
            if(total==0){
                ratio[i]=0;
            } else{
                ratio[i] = (double) cnt[i] / total;
                total -= cnt[i];
            }
        }

        // 실패율로 스테이지 내림차순 정렬
        Integer[] order = new Integer[N];
        for(int i=0; i<N; i++){
            order[i] = i+1;
        }
        Arrays.sort(order, (a, b) -> Double.compare(ratio[b], ratio[a]));

        for(int i=0; i<N; i++){
            answer[i] = order[i];
        }
        return answer;
    }
}