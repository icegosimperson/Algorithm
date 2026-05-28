class PG_181834 {
    public String solution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
}
/*
class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()){
            if(c-'0'< 60){
                sb.append("l");
            } else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
*/