class PG_70129 {
    public int[] solution(String s) {
        int cnt = 0;
        int sum = 0;
        while(!s.equals("1")){
            int zeros = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    zeros++;
                }
            }
            sum += zeros;

            int c = s.length() - zeros;
            s = binary(c); // s = Integer.toBinaryString(c)
            cnt++;
        }
        return new int[]{cnt, sum};
    }
    public String binary(int c){
        if(c==0) return "0";
        StringBuilder sb = new StringBuilder();
        while(c>0){
            sb.append(c%2);
            c /= 2;
        }
        return sb.reverse().toString();
    }
}