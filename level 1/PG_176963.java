import java.util.*;

class PG_176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; // size
        Map<String, Integer> maps = new HashMap<String, Integer>();

        for(int i=0; i<name.length; i++){
            maps.put(name[i], yearning[i]); // key, value (may, 5) / (kein, 10), (kain, 1)
        }

        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                if(maps.containsKey(photo[i][j])){ // may, kein, kain, radi
                    sum += maps.get(photo[i][j]);
                }
                answer[i] = sum;
            }
        }
        return answer;
    }
}