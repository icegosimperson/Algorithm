import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import java.util.StringTokenizer;

// 해당 숫자 카드를 상근이가 가지고 있는지 아닌지 구하는 프로그램
// 숫자가 중복되는 경우는 없음
/*
HashMap을 사용한 이유
데이터를 Key-value로 저장
key값으로 value 검색시 시간복잡도 O(1)
문제 - 중복 허용X, 데이터 순서 중요X

 */
class BOJ_14425{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for(int i=0; i<N; i++){
            hashMap.put(br.readLine(), true);
        }

        int cnt = 0;
        for(int i=0; i<M; i++){
            String input = br.readLine();
            if(hashMap.containsKey(input)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}