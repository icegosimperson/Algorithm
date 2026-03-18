class PG_12951 {
    public String solution(String s) {
        String[] slice = s.toLowerCase().split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<slice.length; i++){
            if(!slice[i].isEmpty()){
                sb.append(slice[i].substring(0, 1).toUpperCase())
                        .append(slice[i].substring(1));
            }
            if(i<slice.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}