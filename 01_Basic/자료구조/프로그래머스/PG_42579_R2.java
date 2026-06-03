import java.util.*;
// Song 데이터 묶기
// 장르 내에서 재생수 내림차순으로 정렬
// 재생 횟수 같은 경우 고유번호 오름차순 정렬
class PG_42579_R2 {
    class Song implements Comparable<Song>{
        int id;
        int play;
        public Song(int id, int play) {
            this.id = id;
            this.play = play;
        }
        @Override
        public int compareTo(Song o){
            if(this.play==o.play){
                return this.id - o.id;
            }
            return o.play - this.play;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        // 1. 총합 구해서 가장 많이 들은 genres 판단
        HashMap<String, Integer> totalGenresMap = new HashMap<>();
        HashMap<String, List<Song>> songsTotalMap = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            totalGenresMap.put(genres[i], totalGenresMap.getOrDefault(genres[i], 0) +plays[i]); // {"classic": 1450, "pop": 3100}
            if(!songsTotalMap.containsKey(genres[i])){
                songsTotalMap.put(genres[i], new ArrayList<>());
            }
            songsTotalMap.get(genres[i]).add(new Song(i, plays[i]));
        }
        List<String> sortedList = new ArrayList<>(totalGenresMap.keySet());
        sortedList.sort((a, b) -> totalGenresMap.get(b) - totalGenresMap.get(a));
        List<Integer> answerList = new ArrayList<>();
        for(String g : sortedList){
            List<Song> songs = songsTotalMap.get(g);
            Collections.sort(songs);
            for(int i=0; i<songs.size() && i<2; i++){
                answerList.add(songs.get(i).id);
            }
        }
        return answerList.stream().mapToInt(x->x).toArray();
    }
}