class PG_181915 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for(int idx : index_list){
            sb.append(my_string.charAt(idx));
        }
        return sb.toString();
    }
}
/*
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i : index_list){
            for(int j=0; j<my_string.length(); j++){
                if(i==j){
                    answer += my_string.charAt(i);
                }
            }
        }
        return answer;
    }
}
*/