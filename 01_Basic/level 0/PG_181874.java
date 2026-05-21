class PG_181874 {
    public String solution(String myString) {
        return myString.toLowerCase().replace('a', 'A');
    }
}
/*
class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char c = myString.charAt(i);
            if(c=='a' || c=='A'){
                answer += 'A';
            } else answer += Character.toLowerCase(c);
        }
        return answer;
    }
}
*/