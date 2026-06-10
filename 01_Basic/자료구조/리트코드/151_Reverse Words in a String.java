class 151_Reverse Words in a String {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.trim().split("\\s+");
        for(int i=split.length-1; i>=0; i--){
            sb.append(split[i]);
            if(i>0) sb.append(" ");
        }
        return sb.toString();
    }
}