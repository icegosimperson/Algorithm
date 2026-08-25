import java.util.*;
class 49. Group Anagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] cArr = s.toCharArray();
            Arrays.sort(cArr);
            String key = String.valueOf(cArr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}