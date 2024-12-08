import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int back = 0; // 가장 마지막 값 저장하기 위한 변수

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch(input){
                case "push":
                    int number = Integer.parseInt(st.nextToken());
                    queue.add(number);
                    back = number;
                    break;
                case "pop":
                    if(queue.isEmpty())
                        sb.append("-1\n");
                     else
                        sb.append(queue.remove()).append("\n");
                     break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty())
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                case "front":
                    if(queue.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(queue.peek()).append("\n");
                    break;
                case "back" :
                    if(queue.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(back).append("\n"); //  가장 뒤에 있는 정수 출력
                    break;
            }
        }
        System.out.println(sb);
    }
}
