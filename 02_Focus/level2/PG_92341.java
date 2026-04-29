import java.util.*;
class PG_92341 {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new TreeMap<>();
        for(String r : records){
            String[] s= r.split(" ");
            String[] t = s[0].split(":");
            int time = Integer.parseInt(t[0])*60 + Integer.parseInt(t[1]);
            String carNumber = s[1];
            int diff = s[2].equals("IN") ? -time : time;
            map.put(carNumber, map.getOrDefault(carNumber, 0)+diff);
        }
        int[] answer = new int[map.size()];
        int idx = 0;
        for(String car : map.keySet()){
            int total = map.get(car);
            if(total<=0) total+= 1439;
            int fee = fees[1];
            if(total > fees[0]){
                fee += Math.ceil((double)(total-fees[0])/fees[2])*fees[3];
            }
            answer[idx++] = fee;
        }
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> inMap = new HashMap<>();
        HashMap<String, Integer> sumMap = new HashMap<>();
        for(String r : records){
            String[] split = r.split(" ");
            String time = split[0];
                String[] timeSplit = time.split(":");
                int hour = Integer.parseInt(timeSplit[0]);
                int min = Integer.parseInt(timeSplit[1]);
                int total = hour*60 + min;
            String carNumber = split[1];
            String type = split[2];
            if(type.equals("IN")){
                inMap.put(carNumber, total);
            }
            else{
                int inTime = inMap.remove(carNumber);
                int parkTime = total - inTime;
                sumMap.put(carNumber, sumMap.getOrDefault(carNumber, 0)+parkTime);
            }
        }
        List<String> remainKeys = new ArrayList<>(inMap.keySet());
        for(String key : remainKeys){
            int inTime = inMap.get(key);
            int parkTime = 1439 - inTime; // 23:59
            sumMap.put(key, sumMap.getOrDefault(key, 0) + parkTime);
        }
        List<String> list = new ArrayList<>(sumMap.keySet());
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            String car = list.get(i);
            int total = sumMap.get(car);
            int basicFee = fees[1];
            if(total > fees[0]){
                basicFee += Math.ceil((double)(total - fees[0])/fees[2]) * fees[3];
            }
            answer[i] = basicFee;
        }

        return answer; // 차량 별로 주차 요금 계산
    }
}
*/