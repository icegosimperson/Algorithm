class PG_181872 {
    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);
        return myString.substring(0, idx+pat.length());
    }
}