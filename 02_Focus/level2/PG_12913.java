class PG_12913 {
    int solution(int[][] land) {
        int answer = 0;
        for(int i=1; i<land.length; i++){
            for(int j=0; j<4; j++){
                int max = 0;
                for(int k=0; k<4; k++){
                    if(j==k) continue;
                    max = Math.max(land[i-1][k], max);
                }
                land[i][j] += max;
            }
        }
        for(int j=0; j<4; j++){
            answer = Math.max(answer, land[land.length-1][j]);
        }
        return answer;
    }
}