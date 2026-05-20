import java.util.*;
class PG_181890 {
    public String[] solution(String[] str_list) {
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                return Arrays.copyOfRange(str_list, 0, i);
            } else if(str_list[i].equals("r")){
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            }
        }
        return new String[]{};
    }
}
/*
틀린 코드
import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        // l, r 인덱스 구한다
        int leftIdx = -1; int rightIdx = -1;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                leftIdx = i;
            } else if (str_list[i].equals("r")){
                rightIdx = i;
            }
        }
        if(list.size()==0) return new String[]{};
        if(leftIdx==-1 || rightIdx==-1) return new String[]{};
        else if(leftIdx < rightIdx){
            for(int i=0; i<leftIdx; i++){
                list.add(str_list[i]);
            }
        } else if(rightIdx > leftIdx){
            for(int i=rightIdx; i<str_list.length; i++){
                list.add(str_list[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
*/