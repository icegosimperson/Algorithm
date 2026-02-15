class PG_250137_R2 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int curH = health;
        int time = attacks[attacks.length-1][0];
        // 1초~time초 시간++
        int attackIdx = 0;
        int cnt = 0;
        for(int i=1; i<=time; i++){
            if(i==attacks[attackIdx][0]){ // 공격 받은 경우
                curH -= attacks[attackIdx][1];
                cnt=0;
                attackIdx++;
                if(curH<=0) return -1; // end
            } else {
                // 공격X
                curH += bandage[1];
                cnt++;
                if(cnt==bandage[0]) {
                    curH += bandage[2]; // 추가체력 회복
                    cnt=0;
                }
                if(curH > health) curH = health;
            }
        }
        return curH;
    }
}