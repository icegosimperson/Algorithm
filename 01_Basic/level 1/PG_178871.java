import java.util.*;
class PG_178871 {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        for(String call : callings){
            int cur = map.get(call);
            String frontPlayer = players[cur-1];
            players[cur-1] = call;
            players[cur] = frontPlayer;
            map.put(call, cur-1);
            map.put(frontPlayer, cur);
        }
        return players;
    }
}