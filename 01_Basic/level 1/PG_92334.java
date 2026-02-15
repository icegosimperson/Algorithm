import java.util.*;
class PG_92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Set<String>> map = new HashMap<>();// <피신고자, 신고자Set>
        HashMap<String, Integer> mailCnt = new HashMap<>(); // <유저, 메일 받을 횟수>

        for(String id : id_list){
            map.put(id, new HashSet<>());
            mailCnt.put(id, 0);
        }
        // 1. 신고 정보 기록
        for(String r : report){
            String[] slice = r.split(" ");
            String reporter = slice[0]; String target = slice[1];
            map.get(target).add(reporter);
        }
        // 2. 정지 기준 확인 
        for(String i : id_list){
            Set<String> reporters = map.get(i);
            if(reporters.size() >= k){
                for(String reporter : reporters){
                    mailCnt.put(reporter, mailCnt.get(reporter)+1);
                }
            }
        }
        int[] answer = new int[id_list.length];
        for(int i=0; i<id_list.length; i++) answer[i] = mailCnt.get(id_list[i]);
        return answer;
    }
}