/*
윤년 : 2/29 O
a=1,3,5,7,8,10,12 b=1~31
a=2, b=1~29
a=4,6,9,11 b=1~30
*/
class PG_12901 {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}; // start = days[5]
        int day = 0;
        for(int i=1; i<a; i++){ // i= 월 번호
            if(i<=7){ // 1~7월 
                if(i%2==0) {
                    if(i==2) {
                        day += 29; // 2월 29일까지
                        continue;
                    }
                    day += 30; // 4, 6
                }
                else day += 31; // 1, 3, 5, 7
            }
            else{
                if(i%2==0) day += 31; // 8, 10, 12
                else day += 30; // 9, 11
            }
        }

        switch((day+(b-1))%7){
            case 1 : answer = days[6]; break; // 토
            case 2 : answer = days[0]; break; // 일
            case 3 : answer = days[1]; break; // 월
            case 4 : answer = days[2]; break; // 화
            case 5 : answer = days[3]; break; // 수
            case 6 : answer = days[4]; break; // 목
            default : answer = days[5]; break; // 금요일 시작
        }

        return answer; // a월 b일이 무슨 요일인지
    }
}

/*
class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; // start = days[5]
        int[] dates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayCnt = 0;
        
        for(int i=0; i<a-1; i++){ // index 주의
            dayCnt += dates[i];
        }
        dayCnt += (b-1);
        
        return days[dayCnt%7];
    }
}
*/