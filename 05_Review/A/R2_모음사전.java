class R2_모음사전 {
    public int count=0;
    public int solution(String word) {
        dfs(word, ""); // 이 단어가 사전에서 몇번째 단어인지
        return count;
        // 사전이 재귀 리턴 식임 -> dfs
    }
    public boolean dfs(String word, String cur){
        char[] vol = {'A', 'E', 'I', 'O', 'U'};
        if(cur.equals(word)){
            return true;
        }
        if(cur.length()==5){
            return false;
        }
        for(int i=0; i<5; i++){
            count++;
            if(dfs(word, cur+vol[i])){
                return true;
            }
        }
        return false;
    }
    // String 추가니까 sb.append()로 해야하나..??;;
}