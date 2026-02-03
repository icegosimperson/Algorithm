class PG_42860_R2 {
    public int solution(String name) {
        int cnt = 0;
        int len = name.length();
        int direction = len-1;
        for(int i=0; i<len; i++){
            cnt += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
            int next = i+1;
            while(next<len && name.charAt(next)=='A'){
                next++;
            }
            int temp = Math.min(i, len-next);
            direction = Math.min(direction, i + (len-next) + temp);
        }
        return cnt+direction;
    }
}