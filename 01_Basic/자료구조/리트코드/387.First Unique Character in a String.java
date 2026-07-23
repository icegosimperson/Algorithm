class 387.First Unique Character in a String {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
/*
import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            String str = s.charAt(i) + "";
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)+"")==1){
                return i;
            }
        }
        return -1;
    }
}
 */