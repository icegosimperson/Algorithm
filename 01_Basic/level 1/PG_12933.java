import java.util.*;

class PG_12933 {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        String reverse = new StringBuilder(new String(arr)).reverse().toString();
        long answer = Long.parseLong(reverse);
        return answer;
    }
}