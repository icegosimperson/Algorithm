class PG_12930 {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                index = 0;
                answer += ' ';
            } else{
                if(index%2==0){
                    answer += Character.toUpperCase(c);
                }  else{
                    answer += Character.toLowerCase(c);
                }
                index++;
            }
        }
        return answer;
    }
}