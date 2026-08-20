class R2_Roman to Integer {
    public int romanToInt(String s) {
        char[] romans = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] nums = {1, 5, 10, 50, 100, 500, 1000}; // len = 7
        int prev=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            for(int j=0; j<romans.length; j++){
                if(c==romans[j]){
                    if(prev<j){
                        sum += (nums[j]-2*nums[prev]);
                    } else{
                        sum += nums[j];
                    }
                    prev = j;
                    break;
                }
            }
        }
        return sum;
    }
}