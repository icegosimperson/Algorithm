import java.util.*;
class PG_181866 {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        for(String s : str){
            if(!s.equals("")){
                list.add(s);
            }
        }
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}