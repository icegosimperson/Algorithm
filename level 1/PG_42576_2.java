/*
동명이인 가능
참가 명단 <-> 완주 명단 비교

이중 for 시간 복잡도 초과
순서 중요X
HashMap<Integer, String>
*/
import java.util.*;

class PG_42576_2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>(); // 이름 : 횟수

        // for (String p : participant) map.put(p, map.getOrDefault(p, 0) + 1);
        for(String p : participant){
            if(map.get(p)==null){
                map.put(p, 1);
            } else{
                map.put(p, map.get(p)+1);
            }
        }

        for(String c : completion){
            map.put(c, map.get(c)-1);
        }

        for(String key : map.keySet()){
            if(map.get(key) !=0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}

/*
        String answer = "";
        List<String> list = new ArrayList<>();
        HashMap<Integer, List<String>> hash = new HashMap<>();
        for(int i=0; i<completion.length; i++){
            list.add(completion[i]);
        }

        for(int i=0; i<completion.length; i++){
            hash.put(i, list);
        }

        for(int i=0; i<participant.length; i++){
            if(!hash.containsValue(participant[i])){
                answer = participant[i];
            }
        }
        return answer;
*/