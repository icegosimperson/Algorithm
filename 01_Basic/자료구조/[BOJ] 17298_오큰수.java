import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] answer = new int[N];

        String[] str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 처음에는 항상 스택이 비어있으므로 초기화
        for(int i=1; i<N; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) { // 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
                answer[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while(!stack.empty()){
            answer[stack.pop()] = -1; // 스택이 비어있지않다면 더 큰 값이 없다는 의미 -1 pop
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 성능 향상시키기 위함
        for(int i=0; i<N; i++){
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush(); // 남아있는 데이터 모두 출력
    }
}


