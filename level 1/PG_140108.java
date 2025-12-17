/*
1. 시간 복잡도 고려 -> 직접 구현 판단
2. while문 안에 움직이는 변수 명확히 정의
3. 투포인터 while 기본 루프 구조 익히기
*/

class PG_140108 {
    public int solution(String s) {
        int answer = 0;
        int startIndex = 0;

        while(startIndex < s.length()){
            char cur = s.charAt(startIndex);
            int xCnt = 1; // 첫글자
            int otherCnt = 0; // x가 아닌 글자들의 횟수
            int j = startIndex + 1;

            while(j < s.length()){
                if(s.charAt(j)==cur){
                    xCnt++;
                } else otherCnt++;

                if(xCnt==otherCnt){ // 분리
                    break;
                }
                j++; // 다음 글자로 이동
            }
            answer++;
            startIndex = j+1; // 다음 분리할 문자열의 시작 인덱스로 이동
        }
        return answer; // 분해한 문자열의 개수 count
    }
}