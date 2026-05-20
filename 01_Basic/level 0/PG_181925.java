class PG_181925 {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int j = numLog.length-2;
        for(int i=numLog.length-1; i>0; i--){
            int minus = numLog[i] - numLog[j];
            switch(minus){
                case 1: sb.append('w'); break;
                case -1: sb.append('s'); break;
                case 10: sb.append('d'); break;
                case -10: sb.append('a'); break;
            }
            j--;
        }
        return sb.reverse().toString();
    }
}