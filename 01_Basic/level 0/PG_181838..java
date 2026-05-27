class PG_181838 {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i=0; i<3; i++){
            if(date1[i] < date2[i]){
                return 1;
            } else if(date1[i] > date2[i]){ // 미래인 경우 처리 누락
                return 0;
            }
        }
        return 0;
    }
}