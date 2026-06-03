import java.util.*;
class PG_42577_R2n {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String p : phone_book){
            map.put(p, map.getOrDefault(p, 0)+1);
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