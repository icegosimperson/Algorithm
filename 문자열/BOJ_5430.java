import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class BOJ_5430{
    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque;
        while(T-->0){
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine()); // 배열에 들어있는 수의 개수
            st = new StringTokenizer(br.readLine(), "[],");
            deque = new ArrayDeque<Integer>();

            for(int i=0; i<n; i++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            simulation(p, deque);
        }
        System.out.println(sb);
    }
    private static void simulation(String input, ArrayDeque<Integer> deque){
        boolean flag = true; // 방향 상태 변수
        for(char c : input.toCharArray()){
            if(c=='R'){
                flag = !flag; // 방향을 바꿔줌
                continue;
            }
            // D일 경우
            if(flag){ // true인 경우
                if(deque.pollFirst()==null){
                    sb.append("error\n");
                    return;
                }
            }
            else{
                if(deque.pollLast()==null){
                    sb.append("error\n");
                    return;
                }
            }
        }
        makeString(deque, flag);
    }
    private static void makeString(ArrayDeque<Integer> deque, boolean flag){
        sb.append("[");
        if (!deque.isEmpty()) {
            if (flag) {
                sb.append(deque.pollFirst());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollLast());
                }
            }
        }
        sb.append("]").append("\n");
    }
}