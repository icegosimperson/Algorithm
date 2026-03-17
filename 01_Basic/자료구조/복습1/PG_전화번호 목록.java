import java.util.*;
class PG_전화번호 목록 {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String p : phone_book){
            map.put(p, 1);
        }
        for(String p : phone_book){
            for(int i=1; i<p.length(); i++){
                if(map.containsKey(p.substring(0, i))){
                    return false;
                }
            }
        }
        return true;
    }
}