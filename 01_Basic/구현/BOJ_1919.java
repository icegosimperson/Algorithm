import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 제거해야 하는 최소 개수의 문자 수를 구하는 프로그램
class BOJ_1919{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        int[] cnt1 = new int[26]; // 알파벳 빈도 수 저장
        int[] cnt2 = new int[26];

        for(int i=0; i< input1.length(); i++){
            cnt1[input1.charAt(i)-'a']++;
        }
        for(int i=0; i< input2.length(); i++){
            cnt2[input2.charAt(i)-'a']++;
        }

        int ans = 0;
        for(int i=0; i<26; i++){
            ans += Math.abs(cnt1[i]-cnt2[i]);
        }
        System.out.println(ans);
    }
}