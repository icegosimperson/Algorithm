/*
[목표]
무엇을 구하는 문제인가? 내림차순

[필요한 정보]
- 뭘 기억해야 하는가? 이미 저장한 정수는 처리
- 정렬
[작업 순서]
1. 문자열로 자료형 변경
2. 문자열 배열로 만들어서 오름차순 정렬
3. 맨 끝에붙어 거꾸로 문자열을 만든 뒤 -> sb.reverse() 이용
4. 다시 long 변환 후 반환

[놓치기 쉬운 조건]
long 범위
*/
import java.util.*;
class R_12933 {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String number = String.valueOf(n);
        String[] split = number.split("");
        Arrays.sort(split);
        for(String s : split){
            sb.append(s);
        }
        long answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}