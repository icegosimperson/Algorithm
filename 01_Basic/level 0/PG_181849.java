class PG_181849 {
    public int solution(String num_str) {
        int answer = 0;
        String[] split = num_str.split("");
        for(String s : split){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(String num_str) {
        int sum = 0;
        for(char c : num_str.toCharArray()){
            String str = String.valueOf(c);
            sum += Integer.parseInt(str);
        }
        return sum;
    }
}
*/
/*
error: incompatible types: char cannot be converted to String
        for(char c : num_str.toCharArray()){
            sum += Integer.parseInt(c);
        }
*/