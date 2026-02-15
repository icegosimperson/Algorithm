import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

// 비밀번호 알아내는 프로그램
class BOJ_5397{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String L = br.readLine();
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> cursor = list.listIterator();

            for(char c: L.toCharArray()) {
                if (c == '-') { // 백스페이스
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                } else if (c == '<') {
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                } else if (c == '>') {
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                } else{
                    cursor.add(c);
                }
            }
            // 만약 커서의 위치가 줄의 마지막이 아니라면,
            // 커서 및 커서 오른쪽에 있는 모든 문자는 오른쪽으로 한 칸 이동한다.
            StringBuilder sb = new StringBuilder();
            for(char c : list){
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}