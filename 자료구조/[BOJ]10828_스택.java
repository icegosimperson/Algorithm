import java.io.*;
import java.util.*;

public class Main {
    // 정수 X를 스택에 넣는 연산
    public static int[] stack;
    public static int pos =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];


        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

        public static void push(int x){
            stack[pos++] = x;
        }

        // 스택에서 가장 위에 있는 정수 뻄, 스택에 정수X -1출력
        public static int pop(){
            if(pos==0){
                return -1;
            }
            else{
                int res = stack[pos -1];
                stack[pos -1] = 0;
                pos--;
                return res;
            }
        }

        // 스택에 들어있는 정수의 개수 출력
        public static int size(){
            return pos;

        }

        public static int empty(){
            if(pos == 0)
                return 1;
            else
                return 0;
        }

        public static int top(){
            if(pos ==0){
                return -1;
            }
            else {
                return stack[pos-1];
            }
        }

}




