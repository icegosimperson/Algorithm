class R2_String to Integer (atoi) {
    public int myAtoi(String s) {
        String str = s.trim();
        if(str.isEmpty()){
            return 0;
        }
        int idx=0;
        int sign=1;
        if(str.charAt(idx)=='-' || str.charAt(idx)=='+'){
            if(str.charAt(idx)=='-'){
                sign = -1;
            }
            idx++;
        }
        long result=0;
        while(idx<str.length() && Character.isDigit(str.charAt(idx))){
            result = result * 10 + (str.charAt(idx)-'0');
            if(result*sign <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(result*sign >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            idx++;
        }
        return (int) result * sign;
    }
}