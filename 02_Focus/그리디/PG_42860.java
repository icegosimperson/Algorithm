class PG_42860 {
    public int solution(String name) {
        int changeCnt = 0;
        int len = name.length();
        int move = len-1;
        for(int i=0; i<len; i++){
            changeCnt += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
            int next = i+1;
            while(next<len && name.charAt(next)=='A'){
                next++;
            }
            int cur = i + (len-next) + Math.min(i, len-next);
            move = Math.min(cur, move);
        }
        return changeCnt+move;
    }
}