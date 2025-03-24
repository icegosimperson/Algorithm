import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
정N각형의 꼭짓점을 이어 만들 수 있는 서로 다르별의 개수를 출력
nC5 계산 구현 하기
 */
class BOJ_1371{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        int max = 0;
        String input;
        while ((input = br.readLine()) != null) {
            for(int i=0; i<input.length(); i++){
                char c = input.charAt(i);
                if('a'<=c && c <='z'){
                    arr[c-'a']++;
                }
            }
        }
        for(int i=0; i<26; i++){
            max = Math.max(max, arr[i]);
        }
        for(int i=0; i<26; i++){
            if(max == arr[i]){
                System.out.print((char)(i+'a'));
            }
        }
    }
}


