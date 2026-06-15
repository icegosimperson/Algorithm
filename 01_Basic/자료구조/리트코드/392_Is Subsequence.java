class 392_Is Subsequence {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
        int cnt = 0;
        if(s.length()==0) return true;
        while(left < s.length()){
            char cur = s.charAt(left++);
            while(right < t.length()){
                char target = t.charAt(right++);
                if(cur==target){
                    cnt++;
                    break;
                }
            }
            if(cnt==s.length()) {
                return true;
            }
        }
        return false;
    }
}
/* solve2
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int sIdx = 0; int tIdx = 0;
        while(tIdx < t.length()){
            if(s.charAt(sIdx) == t.charAt(tIdx)){
                sIdx++;
                if(sIdx==s.length()){
                    return true;
                }
            }
            tIdx++;
        }
        return false;
    }
}
 */