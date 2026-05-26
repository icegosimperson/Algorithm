import java.util.*;
class PG_181851 {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                list.add(new int[]{i, rank[i]});
            }
        }
        list.sort((o1, o2) -> Integer.compare(o1[1], o2[1]));
        int a = list.get(0)[0];
        int b = list.get(1)[0];
        int c = list.get(2)[0];
        return 10000*a + 100*b + c;
    }
}
/* solved 2) 객체
import java.util.*;
class Solution {
    public class Student implements Comparable<Student>{
        int num = 0;
        int rank = 0;
        Student(int num, int rank){
            this.num = num;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s){
            return this.rank - s.rank; // 오름차순
        }
    }
    public int solution(int[] rank, boolean[] attendance) {
        List<Student> list = new ArrayList<>();
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                list.add(new Student(i, rank[i]));
            }
        }
        Collections.sort(list);
        int a = list.get(0).num;
        int b = list.get(1).num;
        int c = list.get(2).num;
        return 10000*a + 100*b + c;
    }
}
/* solved 3) HashMap
import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }
        List<Integer> sortedRank = new ArrayList<>(map.keySet());
        Collections.sort(sortedRank);

        int a = map.get(sortedRank.get(0));
        int b = map.get(sortedRank.get(1));
        int c = map.get(sortedRank.get(2));
        return 10000*a + 100*b + c;
    }
}
/* solved 4) PriorityQueue
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                que.add(i);
        }
        return que.poll() * 10000 + que.poll() * 100 + que.poll();
    }
}
*/
