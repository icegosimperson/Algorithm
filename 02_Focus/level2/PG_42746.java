import java.util.*;
class PG_42746 {
    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, (a, b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String s: num){
            sb.append(s);
        }
        return num[0].equals("0") ? "0" : sb.toString();
    }
}