/*
string 배열에서 n번째 글자 찾기
n번째 글자 기준 오름차순 정렬

CompareTo(음수-오름차순 / 0 동일 / 양수-내림차순)
*/
import java.util.*;
class PG_12915 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n)== s2.charAt(n)){
                return s1.compareTo(s2); // 오름차순
            }
            return s1.charAt(n) - s2.charAt(n); // n번째 글자가 다를 때
        });
        return strings;
    }
}