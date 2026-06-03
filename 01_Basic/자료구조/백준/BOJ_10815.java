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
class BOJ_10815{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 숫자 카드의 개수
        HashMap<Integer, Boolean> hashMap = new HashMap();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            // 숫자 카드 주어짐
            // 6 3 2 10 -10
            hashMap.put(Integer.parseInt(st.nextToken()), true);
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            // 상근이가 가지고 있는 숫자 카드인지 아닌지 판단
            // 10 9 -5 2 3 4 5 10
            int num = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(num)){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);

        // 있으면 1 없으면 0
        // 1 0 0 1 1 0 0 1
    }
}