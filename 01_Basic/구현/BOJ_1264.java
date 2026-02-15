import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){ // 모음 포함 하고 있는지 탐색 시작
            // , . ! ? 으로 끝나는 문장이 주어짐
            String input = br.readLine();
            if(input.equals("#")) break;

            int cnt = 0;
            for(int i=0; i<input.length(); i++){
                char c = Character.toLowerCase(input.charAt(i)); // 대소문자 구분 없이
                if(c=='a' || c=='e' || c=='i'||c=='o' || c=='u'){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

/*
Character.toLowerCase : 대문자를 소문자로 변환하는 내장 메서드

 */
