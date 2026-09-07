import java.util.*;
class R2_가장 큰 수 {
    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, ((a, b) -> (b+a).compareTo(a+b)));
        if(num[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : num){
            sb.append(s);
        }
        return sb.toString();
    }
}