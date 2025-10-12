class PG_12903 {
    public String solution(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        int place = 0;
        if(length%2==0){
            place = length/2;
            sb.append(s.charAt(place-1)).append(s.charAt(place));
        } else{
            place = length/2;
            sb.append(s.charAt(place));
        }
        return sb.toString();
    }
}