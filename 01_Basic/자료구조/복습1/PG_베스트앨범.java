import java.util.*;
class PG_베스트앨범 {
    private static class Song implements Comparable<Song>{
        int id, play;
        Song(int id, int play){
            this.id = id;
            this.play = play;
        }
        @Override
        public int compareTo(Song s){
            if(s.play==this.play){
                return this.id - s.id;
            }
            return s.play - this.play;
        }
    }
    private static class Genre implements Comparable<Genre>{
        int total;
        PriorityQueue<Song> pq = new PriorityQueue<>();
        @Override
        public int compareTo(Genre g){
            return g.total - this.total;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Genre> map = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            map.putIfAbsent(genres[i], new Genre());
            Genre g = map.get(genres[i]);
            g.total += plays[i];
            g.pq.add(new Song(i, plays[i]));
        }
        List<Genre> sorted = new ArrayList<>(map.values());
        Collections.sort(sorted);
        for(Genre g : sorted){
            int cnt = 0;
            while(!g.pq.isEmpty() && cnt < 2){
                answer.add(g.pq.poll().id);
                cnt++;
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}