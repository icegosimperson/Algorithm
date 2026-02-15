class PG_388351_2 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        for(int i=0; i<schedules.length; i++){
            int dayCnt = startday;
            int limitTime = schedules[i] + 10;
            if(limitTime % 100 >= 60) limitTime += 40;
            for(int j=0; j<7; j++){
                if(dayCnt > 7) dayCnt=1;

                if(dayCnt <6){ // 월~금
                    if(limitTime < timelogs[i][j]){
                        answer--;
                        break;
                    }
                }
                dayCnt++;
            }
        }
        return answer;
    }
}