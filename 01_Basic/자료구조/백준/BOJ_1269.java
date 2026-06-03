import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

// 대칭 차집합의 원소의 개수를 출력하는 프로그램
class BOJ_1269{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<A; i++){
            aSet.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<B; i++){
            bSet.add(Integer.parseInt(st.nextToken()));
        }
        int cnt = 0;
        // 더 큰 Set.size*()를 판단? ㄴㄴ
        for(int n: aSet){
            if(!bSet.contains(n)){
                cnt++;
            }
        }

        for(int n: bSet){
            if(!aSet.contains(n)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}