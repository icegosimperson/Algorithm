import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(queue.size()>1){
            for(int i=0; i<K-1; i++){
                queue.offer(queue.poll()); // K번째 수들을 K-1번 꺼내오고 꺼낸 원소를 다시 맨 뒤로 넣음
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
