class 443_String Compression {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while(read<chars.length){
            int cnt = 0;
            char cur = chars[read];
            while(read < chars.length && chars[read]==cur){
                read++;
                cnt++;
            }
            chars[write++] = cur;
            if(cnt>1){
                for(char c : String.valueOf(cnt).toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}