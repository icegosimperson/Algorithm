class PG_388351 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i=0; i<schedules.length; i++){
            int time = schedules[i] + 10;
            int day = startday;
            boolean check = false;
            if(time % 100 >= 60) time += 40;
            for(int j=0; j<7; j++){
                if(day > 7) day = 1;

                if(day < 6){
                    if(time < timelogs[i][j]){
                        answer++;
                        break;
                    }
                }
                day++;
            }
        }
        return answer;
    }
}