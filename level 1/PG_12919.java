class PG_12919 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) {
                answer = Integer.toString(i);
                break;
            }
        }
        return "김서방은 "+ answer + "에 있다";
    }
}