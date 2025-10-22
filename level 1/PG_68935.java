class PG_68935 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        String reversed = sb.toString();

        return Integer.parseInt(reversed, 3); // (문자열, 진법)

    }
}