import java.util.*;
class PG_17677 {
    public HashMap<String, Integer> parseToMap(String s){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<s.length()-1; i++){
            String pair = s.substring(i, i+2);
            if(Character.isLetter(pair.charAt(0)) && Character.isLetter(pair.charAt(1))){
                map.put(pair, map.getOrDefault(pair, 0)+1);
            }
        }
        return map;
    }
    public int solution(String str1, String str2) {
        HashMap<String, Integer> map1 = parseToMap(str1.toLowerCase());
        HashMap<String, Integer> map2 = parseToMap(str2.toLowerCase());
        HashSet<String> set = new HashSet<>();
        set.addAll(map1.keySet());
        set.addAll(map2.keySet());

        int intersection = 0;
        int union = 0;
        for(String s : set){
            int a = map1.getOrDefault(s, 0);
            int b = map2.getOrDefault(s, 0);
            intersection += Math.min(a, b);
            union += Math.max(a, b);
        }
        if(union==0) return 65536;
        return (int)((double) intersection/union * 65536);
    }

}