import java.util.*;
class PG_150370 {
    private int toDate(String date){
        String[] part = date.split("\\.");
        int year = Integer.parseInt(part[0]);
        int month = Integer.parseInt(part[1]);
        int day = Integer.parseInt(part[2]);
        return 12*28*year + 28*month + day;
    }
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(String t : terms){
            String[] part = t.split(" ");
            String type = part[0];
            int month = Integer.parseInt(part[1]);
            map.put(type, month*28);
        }

        for(int i=0; i<privacies.length; i++){
            String[] part = privacies[i].split(" ");
            int start = toDate(part[0]);
            String type = part[1];
            int end = map.get(type);
            int target = toDate(today);
            if(start + end <= target){
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(x->x).toArray();
    }
}