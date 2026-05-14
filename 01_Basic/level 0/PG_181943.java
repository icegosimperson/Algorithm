class PG_181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}
/*
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(i==s){
                for(int j=0; j<overwrite_string.length(); j++){
                    c = overwrite_string.charAt(j);
                    answer += c;

                }
                i += overwrite_string.length()-1;
            } else{
                answer += c;
            }
        }
        return answer;
    }
}
*/