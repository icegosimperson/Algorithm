/*
카드 뭉치에서 순서대로 한장씩

*/

class PG_159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // [i, drink, water]
        // [want, to]
        int c1_index = 0;
        int c2_index = 0;
        int goal_index = goal.length;

        for(int i=0; i<goal.length; i++){
            if(c1_index < cards1.length){
                if(goal[i].equals(cards1[c1_index])){
                    c1_index++;
                    continue;
                }
            }
            if(c2_index < cards2.length){
                if(goal[i].equals(cards2[c2_index])){
                    c2_index++;
                }
            }
        }


        if((c1_index + c2_index) != goal_index){
            return "No";
        }

        return "Yes";
    }
}