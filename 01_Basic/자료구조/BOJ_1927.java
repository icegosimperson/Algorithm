import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int x = Integer.parseInt(br.readLine()); // 우선순위 큐에 값들 넣고
            if(x==0){
                if(pq.isEmpty()){
                    System.out.println("0");
                } else{
                    System.out.println(pq.poll());
                }
            } else{
                pq.add(x);
            }
        }
        // 우선순위에 들어있는 값 넣기
    }
}