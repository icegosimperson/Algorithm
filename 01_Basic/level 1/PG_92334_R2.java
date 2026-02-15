import java.util.*;
class PG_92334_R2 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Set<String>> map = new HashMap<>(); // 신고 당한사람, 신고한 사람
        HashMap<String, Integer> mail = new HashMap<>(); // 유저, 메일 받을 횟수 

        for(String i : id_list){
            map.put(i, new HashSet<>());
            mail.put(i, 0);
        }

        for(String r : report){
            String[] slice = r.split(" ");
            String reporter = slice[0];
            String target = slice[1];
            map.get(target).add(reporter);
        }

        for(String i : id_list){
            Set<String> set = map.get(i);
            if(set.size()>=k){
                for(String reporter : set){
                    mail.put(reporter, mail.get(reporter)+1);
                }
            }
        }
        for(int i=0; i<id_list.length; i++) answer[i] = mail.get(id_list[i]);
        return answer;
    }
}