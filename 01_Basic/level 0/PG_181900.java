class PG_181900 {
    public String solution(String my_string, int[] indices) {
        String[] split = my_string.split("");
        for(int i : indices){
            split[i] = "";
        }
        return String.join("", split);
    }
}
/*
class Solution {
    public String solution(String my_string, int[] indices) {
        String[] split = my_string.split("");
        for(int i : indices){
            split[i] = "";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : split){
            sb.append(s);
        }
        return sb.toString();
    }
}
/*
import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        Arrays.sort(indices);
        for(int i=indices.length-1; i>=0; i--){
            sb.deleteCharAt(indices[i]);
        }
        return sb.toString();
    }
}
*/
