class PG_17687 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int number = 0;
        int idx = 0;
        while(sb.length() < t){
            String str = Integer.toString(number++, n).toUpperCase();
            for(int i=0; i<str.length(); i++){
                if(idx%m==p-1){
                    sb.append(str.charAt(i));
                }
                if(sb.length()==t){
                    return sb.toString();
                }
                idx++;
            }
        }
        return sb.toString();
    }
}