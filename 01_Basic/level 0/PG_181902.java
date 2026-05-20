// A ~ Z (65 ~ 90)
// `[, , ], ^, _, `` (91 ~ 96)
// a ~ z (97 ~122)
class PG_181902 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if('A' <= c && c <='Z'){
                answer[c-'A']++;
            } else{
                answer[c-'a'+26]++;
            }
        }
        return answer;
    }
}