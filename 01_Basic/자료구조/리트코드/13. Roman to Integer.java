class 13. Roman to Integer {
    public int romanToInt(String s) {
        int[] num = {1, 5, 10, 50, 100, 500, 1000};
        char[] cArr = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int prev=-1;
        int total=0;
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<7; j++){
                if(s.charAt(i)==cArr[j]){
                    if(prev!=-1 && prev<j){
                        total += num[j]-(2*num[prev]);
                    }else{
                        total += num[j];
                    }
                    prev=j;
                    break;
                }
            }
        }
        return total;
    }
}