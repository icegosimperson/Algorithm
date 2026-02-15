/*
지갑 : 30 * 15 (가로 * 세로)
지폐 : 26 * 17 (가로 * 세로) 26 > 17

지폐 
max = Math.max(가로, 세로)
조건1) 길이가 긴쪽을 반으로 접기  ) 
조건2) 접기 전 길이 홀수 확인 if(max % 2 !) -> 접은 후 소수점 이하 버림

*/
class PG_340199 {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int walletMin = Math.min(wallet[0], wallet[1]);
        int walletMax = Math.max(wallet[0], wallet[1]);

        int a = bill[0];
        int b = bill[1];
        while(true){
            int billMin = Math.min(a, b);
            int billMax = Math.max(a, b);
            if(billMin <= walletMin && billMax <= walletMax) break;
            if(a>=b) a/=2;
            else b/=2;

            answer++;
        }
        return answer; // 지폐 접는 최소 횟수
    }
}