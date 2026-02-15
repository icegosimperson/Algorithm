class PG_86491_R2 {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for(int[] s : sizes){
            int curMax = Math.max(s[0], s[1]);
            int curMin = Math.min(s[0], s[1]);
            w = Math.max(w, curMax);
            h = Math.max(h, curMin);
        }
        return w*h; // 모든 명함을 포함하는 가장 작은 지갑의 크기
    }
}