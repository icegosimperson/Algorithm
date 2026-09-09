class R2_최소직사각형 { // 회전 가능 -> 가로/세로의 방향 중요(X) -> 각 명함에서 긴 변 / 짧은 변만 중요 -> 각각의 최댓값
    public int solution(int[][] sizes) {
        int maxH = 0;
        int maxW = 0;
        for(int[] s : sizes){
            int w = s[0];
            int h = s[1];
            maxW = Math.max(maxW, Math.max(s[0], s[1]));
            maxH = Math.max(maxH, Math.min(s[0], s[1]));
        }
        return maxW * maxH; // 가장 작은 지갑을 만들 때
    }
}