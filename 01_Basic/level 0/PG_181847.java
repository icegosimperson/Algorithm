class PG_181847 {
    public String solution(String n_str) {
        return String.valueOf( Integer.parseInt(n_str));
    }
}
/*
class Solution {
    public String solution(String n_str) {
        int idx = 0;
        for(int i=0; i<n_str.length(); i++){
            char c = n_str.charAt(i);
            if(c!='0'){
                idx = i;
                break;
            }
        }
        return n_str.substring(idx, n_str.length());
    }
}
*/