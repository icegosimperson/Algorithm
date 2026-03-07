class PG_42862_R4 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] people = new int[n+2];
        for(int i=1; i<=n; i++){
            people[i] = 1;
        }
        for(int l : lost){
            people[l] -= 1;
        }
        for(int r : reserve){
            people[r] += 1;
        }
        // {2, 0, 2, 0, 2}
        for(int i=1; i<=n; i++){
            if(people[i]==0){
                if(people[i-1]==2){
                    people[i-1] -= 1;
                    people[i] += 1;
                } else if(people[i+1]==2){
                    people[i+1] -= 1;
                    people[i] += 1;
                }
            }
        }
        for(int i=1; i<=n; i++){
            if(people[i]>=1) answer++;
        }
        return answer;
    }
}