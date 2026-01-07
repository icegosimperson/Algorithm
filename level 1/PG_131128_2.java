class PG_131128_2 {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for(int i=0; i<X.length(); i++){
            xCount[X.charAt(i)-'0']++;
        }
        for(int i=0; i<Y.length(); i++){
            yCount[Y.charAt(i)-'0']++;
        }

        for(int i=9; i>=0; i--){
            int common = Math.min(xCount[i], yCount[i]);
            for(int j=0; j<common; j++){
                sb.append(i);
            }
        }
        answer = sb.toString();
        if(answer.isEmpty()) return "-1";
        else if(answer.charAt(0)=='0') return "0";
        else return answer;
    }
}