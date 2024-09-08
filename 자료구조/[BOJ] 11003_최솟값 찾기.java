import org.w3c.dom.Node;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 버퍼에 넣어서 한번에 출력하기 위함
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // N개의 수 입력
        int L = Integer.parseInt(st.nextToken()); // L : 슬라이드 윈도우 범위
        Deque<Node> myDeque = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int now = Integer.parseInt(st.nextToken());

            // 현재 값보다 큰 값을 덱에서 제거
            while(!myDeque.isEmpty() && myDeque.getLast().value > now){
                myDeque.removeLast(); // 뒤쪽에서 현재 값보다 큰 값을 덱에서 제거
            }
            myDeque.addLast(new Node(now, i)); // 현재 값을 덱의 뒤쪽에 추가

            // 덱의 앞쪽 값이 윈도우 범위를 벗어나면
            if(myDeque.getFirst().index <= i-L){
                myDeque.removeFirst(); // 제거
            }
            bw.write(myDeque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }
    static class Node{ // 슬라이딩 윈도우 내에서 각 값과 그 값이 배열에서 가지는 인덱스, 덱 안의 최솟값 관리를 위해 윈도우 범위 벗어나면 인덱스 이용하여 삭제
        public int value;
        public int index;
        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}


