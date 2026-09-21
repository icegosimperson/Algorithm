/*
재생 수 가장 많은 장르 <장르수, 총재생수>
가장 많은 장르 순으로 정렬 -> Map -> List.sort(총 재생수 내림차순)
장르 별로 재생 많이 된 노래 2개의 고유번호(id)
재생수가 많은 list키 값과 동일한거 2개만 꺼내기 (1개 일 수도 있음 주의)
list -> int[] answer 변환
*/
import java.util.*;
class R3_베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> totalMap = new HashMap<>();
        HashMap<String, List<Integer>> songMap = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);
            if(!songMap.containsKey(genres[i])){
                songMap.put(genres[i], new ArrayList<>());
            }
            songMap.get(genres[i]).add(i);
        }
        List<String> totalList = new ArrayList<>(totalMap.keySet());
        totalList.sort((a, b) ->
                Integer.compare(totalMap.get(b), totalMap.get(a))
        );
        List<Integer> bestList = new ArrayList<>();
        for(String g : totalList){
            List<Integer> songList = songMap.get(g);
            songList.sort((a, b) ->{
                if(plays[a]==plays[b]){
                    return Integer.compare(a, b);
                }
                return Integer.compare(plays[b], plays[a]);
            });
            for(int i=0; i<Math.min(songList.size(), 2); i++){
                bestList.add(songList.get(i));
            }
        }
        int[] answer = new int[bestList.size()];
        for(int i=0; i<bestList.size(); i++){
            answer[i] = bestList.get(i);
        }
        return answer;
    }
}