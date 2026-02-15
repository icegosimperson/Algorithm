class PG_72410_R2 {
    public String solution(String new_id) {
        String n = new_id.toLowerCase()
                .replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("[.]{2,}", ".")
                .replaceAll("^[.]|[.]$", "");

        if(n.isEmpty()) n = "a";
        if(n.length()>=16){
            n= n.substring(0, 15);
            n= n.replaceAll("[.]$", "");
        }
        StringBuilder sb = new StringBuilder(n);
        while(sb.length()<=2){
            sb.append(sb.charAt(sb.length()-1));
        }
        return sb.toString();
    }
}