import java.util.*;
class PG_42579 {
    class Song implements Comparable<Song> {
        int id, play;
        Song(int id, int play) {
            this.id = id;
            this.play = play;
        }
        @Override
        public int compareTo(Song o) {
            if (this.play == o.play) return this.id - o.id; // 재생수 같으면 ID 낮은 순
            return o.play - this.play; // 재생수 높은 순
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> totalMap = new HashMap<>();
        HashMap<String, List<Song>> songsMap = new HashMap<>();

        // 1. 장르별 총 재생 횟수
        for(int i=0; i<genres.length; i++){
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);
            if (!songsMap.containsKey(genres[i])) {
                songsMap.put(genres[i], new ArrayList<>());
            }
            songsMap.get(genres[i]).add(new Song(i, plays[i]));
        }

        // 2. 가장 많이된 장르부터 재생횟수 내림차순으로 고유번호 return
        List<String> sortedList = new ArrayList<>(totalMap.keySet());
        sortedList.sort((a, b)->totalMap.get(b)-totalMap.get(a));
        List<Integer> result = new ArrayList<>();

        for(String g : sortedList){
            List<Song> songs = songsMap.get(g);
            Collections.sort(songs);
            for(int i=0; i<songs.size() && i<2; i++){
                result.add(songs.get(i).id);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}