import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테케 개수

        // 맨 왼쪽은 0번째, N개의 문서 중요도
        while(T-->0){
            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st.nextToken()); // 몇번째로 인쇄되었는지 궁금한 문서가 현재 Queue에 몇번재로 놓여있는지 나타내는 정수

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{i, priority}); // {인덱스, 중요도}
                pq.offer(priority); // 중요도 저장
            }
            int out = 0; // 현재까지 몇번째 문서가 인쇄되었는지 나타냄, 중요도가 높은 문서가 인쇄될때마다 증가시켜
            // 몇번째로 인쇄되었는지 추적
            while(!queue.isEmpty()){
                int[] cur = queue.poll(); // 큐의 맨앞 문서를 가져옴
                if(cur[1]== pq.peek()){ // 큐의 맨앞 문서와 우선순위 큐의 가장 높은 중요도를 비교
                    out++; // 현재 문서의 중요도가 가장 높을 경우 -> 출력 순서 증가
                    pq.poll(); // 우선순위 큐에서도 제거
                    if(cur[0]==M){  // 궁금한 문서(인덱스)인 경우
                        sb.append(out).append('\n');
                        break;
                    }
                } else{ // 중요도가 더 높은 문서가 있는 경우 뒤로 이동
                    queue.offer(cur);
                }
            }
        }
        System.out.println(sb); // 문서가 몇번째로 인쇄되는지 인덱스 출력
    }
}