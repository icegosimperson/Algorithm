import java.util.*;
class PG_845152_R3 {
    ArrayList<String> list = new ArrayList<>();
    String[] rule = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        dfs("", word);
        return list.indexOf(word);
    }
    public boolean dfs(String cur, String target){
        list.add(cur);
        if(cur.equals(target)){
            return true;
        }
        if(cur.length()==5){
            return false;
        }
        for(int i=0; i<5; i++){
            if(dfs(cur+rule[i], target)){
                return true;
            }
        }
        return false;
    }
}