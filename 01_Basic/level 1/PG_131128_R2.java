class PG_131128_R2 {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        // 0. 초기화
        // for(int i : X.length()) xCount[X.charAt(i)]++;
        for(int i=0; i<X.length(); i++){
            xCount[X.charAt(i)-'0']++;
        }
        for(int i=0; i<Y.length(); i++){
            yCount[Y.charAt(i)-'0']++;
        }
        // 1. 공통된 수 찾기
        // 2. 가장 큰 정수로 만듦
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            int cnt = Math.min(xCount[i], yCount[i]);
            for(int j=0; j<cnt; j++){
                sb.append(i);
            }
        }
        String answer = sb.toString();
        // 3. 예외 조건1) 존재X -1, 조건2) 짝궁 0 구성
        if(answer.isEmpty()) return "-1";
        if(answer.startsWith("0")) return "0";
        return answer;
    }
}