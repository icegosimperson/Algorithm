class PG_42860_R4 {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move = len-1;
        for(int i=0; i<len; i++){
            char c = name.charAt(i);
            answer += Math.min(c-'A', 'Z'-c+1); // 상 or 하
            int next = i+1;
            while(next<len && name.charAt(next)=='A'){
                next++;
            }
            // 왼쪽 or 오른쪽
            move = Math.min(move, i*2+ (len-next));
            move = Math.min(move, i+2*(len-next));
        }
        return answer+move;
    }
}