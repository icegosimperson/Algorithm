/*
완주하지 못한 선수의 이름을 return
participant 배열 원소 중에서 completion 배열에 없는 사람 찾기
완주한 선수(completion)를 HashMap에 넣기
*/


/*
HashMap<String, Integer> hashmap = new HashMap<Integer, String>(); // Key, Value +1
해시맵 두개 써서

*/
import java.util.*;



class PG_42576 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

        for(String c : completion){ // 완주한 사람이면 +1
            hashmap.put(c, hashmap.getOrDefault(c, 0)+1); // 동명이인 방지
        }

        for(String p : participant){
            if(hashmap.getOrDefault(p,0)==0){
                return p; // 완주하지 못한 선수를 반환
            }
            else{
                hashmap.put(p, hashmap.get(p)-1); // 참가자명단에 있으면 -1
            }
        }
        return "";
    }
}




