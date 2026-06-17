class 1456_Maximum Number of Vowels in a Substring of Given Length {
    public int maxVowels(String s, int k) {
        int cnt = 0;
        for(int i=0; i<k; i++){
            if(isVowels(s.charAt(i))){
                cnt++;
            }
        }
        int maxCnt = cnt;
        for(int i=k; i<s.length(); i++){
            if(isVowels(s.charAt(i))){
                cnt++;
            }
            if(isVowels(s.charAt(i-k))){
                cnt--;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt;
    }
    public boolean isVowels(char cur){
        return cur=='a' || cur=='e' || cur=='i' || cur=='o' || cur=='u';
    }
}