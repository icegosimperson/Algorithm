import java.util.*;
class PG_181855 {
    public int solution(String[] strArr) {
        int[] len = new int[31];
        for(String s : strArr){
            len[s.length()]++;
        }
        return Arrays.stream(len).max().getAsInt();
    }
}
/*
import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] len = new int[31];
        for(String s : strArr){
            len[s.length()]++;
        }
        Arrays.sort(len);
        return len[len.length-1];
    }
}
*/
/*
len <30 조건 없는 경우 풀이
import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        // Key: 문자열 길이, Value: 해당 길이를 가진 문자열의 개수
        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. strArr을 돌면서 각 길이의 개수를 맵에 저장
        for (String s : strArr) {
            int len = s.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }

        // 2. map에 저장된 '개수(Value)'들 중 가장 큰 값 찾기
        int max = 0;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
*/