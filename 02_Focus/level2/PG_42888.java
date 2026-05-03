import java.util.*;
class PG_42888 {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        for(String r : record){
            String[] s = r.split(" ");
            String command = s[0]; String id = s[1];
            if(!command.equals("Leave")){
                map.put(s[1], s[2]);
            }
        }
        ArrayList<String> answer = new ArrayList<>();
        for(String r : record){
            String[] s = r.split(" ");
            String command = s[0]; String id = s[1];
            if(command.equals("Enter")){
                answer.add(map.get(id) + "님이 들어왔습니다.");
            } else if(command.equals("Leave")){
                answer.add(map.get(id) + "님이 나갔습니다.");
            }
        }
        return answer.toArray(new String[0]);
    }
}