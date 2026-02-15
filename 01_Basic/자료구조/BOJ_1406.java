import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

class BOJ_1406{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        LinkedList<Character> lists = new LinkedList<>();
        String input = br.readLine(); // 길이가 N인 문자열
        int M = Integer.parseInt(br.readLine()); // 입력할 명령어의 개수

        for(char c : input.toCharArray()){
            lists.add(c);
        }

        // 커서를 맨 뒤로 설정
        ListIterator<Character> cursor = lists.listIterator(lists.size());
        while(M-->0){
            st = new StringTokenizer(br.readLine());
            char command = st.nextToken().charAt(0);
            if(command=='L'){ // 커서를 왼쪽으로 한칸 옮김
                if(cursor.hasPrevious()){
                    cursor.previous();
                }
            } else if(command=='D'){ // 커서를 오른쪽 한칸으로 옮김
                if(cursor.hasNext()){
                    cursor.next();
                }
            } else if(command=='B'){ // 커서 왼쪽에 있는 문자 삭제
                if(cursor.hasPrevious()){
                    cursor.previous();
                    cursor.remove(); // 커서 왼쪽 문자 삭제
                }
            } else if(command=='P'){
                char x = st.nextToken().charAt(0);
                cursor.add(x);
            }
        }
        for(char c : lists){
            sb.append(c);
        }
        System.out.println(sb);
    }
}