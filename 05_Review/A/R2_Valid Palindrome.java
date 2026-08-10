class R2_Valid Palindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char s1 = Character.toLowerCase(s.charAt(start));
            char s2 = Character.toLowerCase(s.charAt(end));
            if(!Character.isLetterOrDigit(s1)){
                start++;
            } else if(!Character.isLetterOrDigit(s2)){
                end--;
            } else if(s1 != s2){
                return false;
            } else{
                start++;
                end--;
            }
        }
        return true;
    }
}