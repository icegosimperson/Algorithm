import java.util.*;
class PG_258712_R2 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int length = friends.length;
        int[][] score = new int[length][length];
        int[] points = new int[length];
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<length; i++){
            map.put(friends[i], i);
        }
        // gifts[발신자, 수신자]
        for(String g : gifts){
            String[] split = g.split(" ");
            int giveIdx = map.get(split[0]);
            int receiveIdx = map.get(split[1]);
            score[giveIdx][receiveIdx]++;
            points[giveIdx]++;
            points[receiveIdx]--;
        }
        // 선물 지수 판단 로직 필요
        for(int i=0; i<length; i++){
            int cnt = 0;
            for(int j=0; j<length; j++){
                if(i==j) continue;
                if(score[i][j] > score[j][i] || score[i][j]==score[j][i] && points[i] > points[j]) cnt++;
            }
            answer = Math.max(answer, cnt);
        }
        return answer; // 가장 많이 받는 선물 개수
    }
}