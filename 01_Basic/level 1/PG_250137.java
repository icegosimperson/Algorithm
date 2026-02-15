// b[시전 시간, 초당 회복량, 추가 회복량] 
// a[공격 시간, 피해량]
class PG_250137 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 1. 몬스터의 마지막 공격 시간 파악 (총 시간 알기 위함)
        int endTime = attacks[attacks.length-1][0];
        int curHealth = health; // 현재 체력
        int continuCnt = 0; // 연속 공격 성공
        int attackIdx = 0; // 다음 공격의 인덱스
        for(int i=0; i<=endTime; i++){
            // if 공격 받는 경우 -> 연속 공격 성공=0 초기화, -체력
            if(i==attacks[attackIdx][0]){
                curHealth -= attacks[attackIdx][1];
                attackIdx++;
                continuCnt = 0;
                if(curHealth<=0) return -1;  // 죽는 경우 return -1
            }
            else if(i>0){
                // else 공격X -> 연속공격++, 체력+(초당 회복량
                curHealth += bandage[1];
                continuCnt++;
                // if(연속 회복 경우 확인 -> 연공 횟수 초기화)
                if(continuCnt==bandage[0]){
                    curHealth += bandage[2]; // 추가 회복
                    continuCnt=0;
                }
                // if 최대 체력이상 회복 불가
                if(curHealth > health){
                    curHealth = health;
                }
            }
        }
        return curHealth; // 남은 체력(죽을 경우 -1)  
    }
}