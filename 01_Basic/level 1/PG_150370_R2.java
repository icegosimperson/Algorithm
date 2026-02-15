import java.util.*;

class PG_150370_R2 {
    private static int toDay(String day){
        String[] temp = day.split("\\.");
        int y = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int d = Integer.parseInt(temp[2]);
        return 12*28*y + 28*m + d;
    }
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(String t : terms){
            String[] slice = t.split(" ");
            String type = slice[0];
            int month = Integer.parseInt(slice[1]);
            map.put(type, month*28);
        }

        for(int i=0; i<privacies.length; i++){
            String[] tmp = privacies[i].split(" ");
            int startDate = toDay(tmp[0]);
            String type = tmp[1];
            int end = map.get(type);
            int target = toDay(today);

            if(startDate + end <= target){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(x->x).toArray(); // 파기할 개인정보 번호
    }
}