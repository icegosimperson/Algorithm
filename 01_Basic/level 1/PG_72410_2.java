class PG_72410_2 {
    public String solution(String new_id) {
        String n = new_id.toLowerCase()
                .replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("[.]{2,}", ".")
                .replaceAll("^[.]|[.]$", "");
        if(n.isEmpty()) n = "a";
        if(n.length() >=16) {
            n = n.substring(0, 15);
            n = n.replaceAll("[.]$", "");
        }
        while(n.length() <3){
            n += n.charAt(n.length()-1);
        }
        return n;
    }
}