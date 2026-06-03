// map이 필요한 이유: phone_book 배열 길이가 10^6 이상이여서 빠른 탐색이 필요
// <Key, Value> = <찾고싶은 대상, 부가정보>
import java.util.*;

class PG_42577 {
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