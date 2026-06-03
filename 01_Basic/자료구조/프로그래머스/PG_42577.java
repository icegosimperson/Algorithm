import java.util.*;

// 배열 길이 10^6 O(N^2) 탐색 시 시간초과
// HashMap으로 O(1) 빠르게 값이 포함되는지 찾기
class PG_42577 {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> hashmap = new HashMap<>();

        for(int i=0; i<phone_book.length; i++){
            hashmap.put(phone_book[i], i);
        }
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(hashmap.containsKey(phone_book[i].substring(0, j))){
                    return false;
                }
            }
        }
        return true;
    }
}