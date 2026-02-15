class PG_43163 {
    static int answer = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, visited, 0);
//        return answer = Integer.MAX_VALUE ? 1 : answer; 정답
        return answer;
    }
    public void dfs(String cur, String target, String[] words, boolean[] visited, int count){
        if(cur.equals(target)){
            answer = Math.min(answer, count);
            return;
        }
        if(count>=answer){
            return;
        }
        for(int i=0; i<words.length; i++){
            if(!visited[i] && !canConvert(cur, words[i])){
                visited[i] = true;
                dfs(words[i], target, words, visited, count+1);
                visited[i] = false;
            }
        }
        return;
    }
    public boolean canConvert(String s1, String s2){
        int diff = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                diff++;
                return false;
            }
        }
        return diff==1;
    }
}