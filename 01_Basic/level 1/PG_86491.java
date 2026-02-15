class PG_86491 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int a=0, b=0;
        for(int i=0; i<sizes.length; i++){
            int wMax = Math.max(sizes[i][0], sizes[i][1]); // 가로 맥스
            int hMax = Math.min(sizes[i][0], sizes[i][1]); // 세로 맥스
            a = Math.max(a, wMax);
            b = Math.max(b, hMax);
        }
        answer = a * b;
        return answer;
    }
}