import java.util.*;

class PG_42746_R2{
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNumbers, (a, b) -> (b+a).compareTo(a+b));
        return strNumbers[0].equals("0") ? "0" : String.join("", strNumbers);
    }
}