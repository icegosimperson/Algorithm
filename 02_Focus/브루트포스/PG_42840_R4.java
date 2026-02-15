import java.util.*;
class PG_42840_R4 {
    public int[] solution(int[] answers) {
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] score = new int[pattern.length];
        for(int i=0; i<answers.length; i++){
            for(int j=0; j<pattern.length; j++){
                if(answers[i]==pattern[j][i%pattern[j].length]){
                    score[j]++;
                }
            }
        }
        int maxScore = 0;
        for(int s : score){
            maxScore = Math.max(maxScore, s);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            if(score[i]==maxScore){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}