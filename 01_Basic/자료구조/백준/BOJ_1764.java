import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;


// 듣보잡 명단을 구하는 프로그램 작성
// 시간 복잡도 : N<=5*10^5, O(N) 이하로 구현
public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());// 듣도 못한 사람의 수 N, 보도 못한 수 M
        int M = Integer.parseInt(st.nextToken());

        // 중복 허용X, 집합연산(교집합), 데이터 순서 중요X -> HashSet
        // HashSet : 데이터 삽입, 검색 O(1)
        HashSet<String> hashN = new HashSet<>();
        for(int i=0; i<N; i++){
            hashN.add(br.readLine());
        }

        // 듣보잡 결과를 저장 : ArrayList
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<M; i++){
            String input = br.readLine();
            if(hashN.contains(input)){ // 보도 못한 사람 명단과 중복될 경우
                result.add(input); // 듣보잡 결과에 저장
            }
        }

        Collections.sort(result); // 사전 순 정렬

        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n"); // 듣보잡의 수
        for(String s:result){
            sb.append(s).append("\n"); // 듣보잡 명단 출력
        }
        System.out.println(sb);
    }
}
