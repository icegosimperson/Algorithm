import java.util.*;

class PG_84512 {
    List<String> list = new ArrayList<>();
    String[] arr = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        dfs("");
        return list.indexOf(word);
    }
    public void dfs(String str){
        if(str.length()>5) return;
        list.add(str);
        for(int i=0; i<5; i++){
            dfs(str + arr[i]);
        }
    }
}