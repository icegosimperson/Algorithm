import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2)->{ // 우선순위 큐 : 작은 값이 우선순위가 높다
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs){ // 1) 절대값이 같을 경우
                return o1 > o2 ? 1 : -1; // 음수 우선
            } else {
                return first_abs - second_abs;  // 2) 절대값 다른 경우, 작은 값이 우선
            }
        });
        for(int i=0; i<N; i++){
            int request = Integer.parseInt(br.readLine());
            if(request ==0){ // 0 요청 시 절대값이 가장 작은 값 출력
                if(myQueue.isEmpty()){ // 우선순위 큐가 비어있다면
                    System.out.println("0"); // "0" 출력
                }else{
                    System.out.println(myQueue.poll()); // 절대갑싱 가장 작은 값 출력
                }
            } else{
                myQueue.add(request);
            }
        }
    }
}


