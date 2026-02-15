import java.util.*;

class PG_84512 {
    ArrayList<String> list = new ArrayList<>();
    String[] rule = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        dfs("");
        return list.indexOf(word);
    }
    public void dfs(String curWord){
        list.add(curWord);
        if(curWord.length()==5) return;
        for(int i=0; i<rule.length; i++){
            dfs(curWord + rule[i]);
        }
    }
}