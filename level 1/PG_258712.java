import java.util.*;

class PG_258712 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        int[][] history = new int[friends.length][friends.length];
        int[] points = new int[friends.length];

        for(int i=0; i<friends.length; i++){
            map.put(friends[i], i);
        }

        for(String g : gifts){
            String[] slice = g.split(" ");
            int giveIdx = map.get(slice[0]);
            int recieveIdx = map.get(slice[1]);

            history[giveIdx][recieveIdx]++;
            points[giveIdx]++;
            points[recieveIdx]--;
        }

        for(int i=0; i<friends.length; i++){
            int cnt = 0;
            for(int j=0; j<friends.length; j++){
                if(i==j) continue;
                if(history[i][j] > history[j][i]){
                    cnt++;
                } else if(history[i][j]==history[j][i]){
                    if(points[i]>points[j]) cnt++;
                }
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
}