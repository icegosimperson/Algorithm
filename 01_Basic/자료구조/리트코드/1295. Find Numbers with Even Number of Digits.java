class 1295. Find Numbers with Even Number of Digits {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int num : nums){
            int k=0;
            while(num>0){
                num /= 10;
                k++;
            }
            if(k%2==0){
                cnt++;
            }
        }
        return cnt;
        // return 자릿수가 짝수
    }
}