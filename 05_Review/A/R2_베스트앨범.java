import java.util.*;
class R2_베스트앨범 {
    // 3. Song 객체 선언
    public class Song{
        String g; int play; int id;
        Song(String g, int play, int id){
            this.g = g;
            this.play = play;
            this.id = id;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        // 1. 총 재생 수가 많은 장르 구하기 HashMap<String, Integer>
        HashMap<String, Integer> genreMap = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0)+plays[i]);
        }
        // 2. 총 재생수가 많은 순으로 정렬
        // Map 정렬 -> entrySet() -> list -> sort
        List<Map.Entry<String, Integer>> genreList = new ArrayList<>(genreMap.entrySet());
        genreList.sort((a, b) ->
                b.getValue() - a.getValue()
        );

        // 4. 장르 중에서도 재생 순으로 정렬하기 위한 HashMap<String, List<Song>>
        HashMap<String, List<Song>> songs = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            songs.putIfAbsent(genres[i], new ArrayList<>());
            songs.get(genres[i]).add(new Song(genres[i], plays[i], i));
        }

        //  5. 장르 별로 최대 2개 곡 번호 추가해서 최종 답
        // 앞에서 구한 가장 많은 장르 부터
        // 장르 중에서도 재생수 순 정렬(내림차순) - 같을 시 고유 번호(오름차순)
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : genreList){
            String key = entry.getKey();
            List<Song> list = songs.get(key);
            list.sort((a, b)->{
                if(b.play==a.play){
                    return a.id - b.id;
                }
                return b.play - a.play;
            });
            result.add(list.get(0).id);
            if(list.size()>1){
                result.add(list.get(1).id);
            }
        }
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}