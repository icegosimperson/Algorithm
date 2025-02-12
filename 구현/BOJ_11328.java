import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 학생들을 모두 배정하기 위해 필요한 최소한의 방의 수
// a의 알파벳 개수 = b 의 알파벳 개수가 같은지 확인
class BOJ_11328{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); // tc
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            for (char c : a.toCharArray()) { // 문자열 a의 알파벳 개수 카운트
                arr1[c - 'a']++;
            }

            for (char c : b.toCharArray()) {
                arr2[c - 'a']++;
            }

            boolean check = true;

            for(int i=0; i<26; i++){
                if(arr1[i] != arr2[i]){
                    check = false;
                    break;
                }
            }
            System.out.println(check ? "Possible" : "Impossible");


        }
    }
}