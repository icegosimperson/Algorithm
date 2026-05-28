class PG_181836 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for(String p : picture){
            StringBuilder sb = new StringBuilder();
            for(char c : p.toCharArray()){
                sb.append(String.valueOf(c).repeat(k));
            }
            for(int i=0; i<k; i++){
                answer[idx++] = sb.toString();
            }
        }
        return answer;
    }
}