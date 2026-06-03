import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// N번째 큰 수를 찾는 프로그램

/*
규칙 : 모든 수는 자신의 한 칸 위에 있는 수보다 크다
2차원으로 주어짐

 */
class BOJ_2075{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i=0; i<N-1; i++){
            pq.poll();
        }
        sb.append(pq.peek());
        System.out.println(sb);
    }
}