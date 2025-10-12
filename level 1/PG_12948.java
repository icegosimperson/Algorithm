class PG_12948 {
    public String solution(String phone_number) {
        int length = phone_number.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<length; i++){
            if(i<length - 4){
                sb.append('*');
            } else{
                sb.append(phone_number.charAt(i));
            }
        }
        return sb.toString();
    }
}