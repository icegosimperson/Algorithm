import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// O(N)이하로 풀기
// check 연산 결과 출력하는 문제

/*O(M *N) -> 시간 초과 O
비트마스킹 이용하여 모든 연산 O(1)로 처리
- List.contains() 시간 복잡도 : O(N)
- 비트마스킹 : 정수 이진 표현을 사용하여 특정 비트(on/off) 활용해 데이터 표현 or 연산
- 범위 제한, 집합 연산 효율적 수행, 조합 or 부분 집합 문제 다룰 때(2^n개), 상태 저장 or 추적(그래프 방문 여부)
 */
public class BOJ_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int bits = 0; // 비트마스킹

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("add")){
                int x = Integer.parseInt(st.nextToken());
                bits |= (1 << (x - 1)); // OR 연산 : x번째 비트 on
                // bit |= (1<<x) : x번째 비트를 1로 설정
            } else if(command.equals("remove")){
                int x = Integer.parseInt(st.nextToken());
                bits &= ~(1 << (x - 1)); // AND연산 + NOT 연산 : x번째 비트 off
            } else if(command.equals("check")){
                int x = Integer.parseInt(st.nextToken());
                sb.append((bits & (1 << (x - 1))) != 0 ? 1 : 0).append("\n");
            } else if(command.equals("toggle")){
                int x = Integer.parseInt(st.nextToken());
                bits ^= (1 << (x - 1)); // XOR 연산 : x 번째 비트 반전
            }else if(command.equals("all")){
                bits = (1<<20)-1; // 모든 비트 on
            } else if(command.equals("empty")){
                bits = 0;
            }
        }
        System.out.print(sb); // sout 시간 초과로 StringBuilder 추가
    }
}