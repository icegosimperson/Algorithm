import java.util.*;
class PG_17680 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> list = new LinkedList<>();
        if(cacheSize==0) return 5 * cities.length;
        for(String c : cities){
            String city = c.toLowerCase();
            if(list.remove(city)){
                answer += 1;
                list.addLast(city);
            } else{
                answer += 5;
                if(list.size() >= cacheSize){
                    list.removeFirst();
                }
                list.addLast(city);
            }
        }
        return answer;
    }
}