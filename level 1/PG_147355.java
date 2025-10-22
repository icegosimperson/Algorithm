class PG_147355 {
    public int solution(String t, String p) {
        int cnt = p.length();
        int answer = 0;
        for(int i=0; i<=t.length()-cnt; i++){
            String temp = t.substring(i, i+cnt);
            if(temp.compareTo(p)<=0){
                answer++;
            }
        }
        return answer;
    }
}