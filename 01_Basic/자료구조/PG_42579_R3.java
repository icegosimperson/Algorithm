import java.util.*;

class PG_42579_R3 {
    class Song implements Comparable<Song>{
        int id; int play;
        public Song(int id, int play){
            this.id = id;
            this.play = play;
        }
        @Override
        public int compareTo(Song s){
            if(this.play==s.play){ // 재생수 동일
                return this.id-s.id; // 고유번호 오름차순
            }
            return s.play-this.play; // 재생수 내림차순
        }
    }
    static class Genre implements Comparable<Genre> {
        int totalPlay = 0;
        PriorityQueue<Song> songsPq = new PriorityQueue<>();
        @Override
        public int compareTo(Genre g) {
            return g.totalPlay - this.totalPlay;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Genre> map = new HashMap<>();

        for(int i=0; i<genres.length; i++){
            map.putIfAbsent(genres[i], new Genre());
            Genre g = map.get(genres[i]);
            g.totalPlay += plays[i];
            g.songsPq.add(new Song(i, plays[i]));
        }
        List<Genre> sortedGenres = new ArrayList<>(map.values());
        Collections.sort(sortedGenres);
        List<Integer> answer = new ArrayList<>();
        for(Genre g : sortedGenres){
            int cnt = 0;
            while(!g.songsPq.isEmpty() && cnt < 2){
                answer.add(g.songsPq.poll().id);
                cnt++;
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}