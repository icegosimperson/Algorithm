class PG_42862_R5 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] people = new int[n+2];
        for(int i=1; i<=n; i++){
            people[i] = 1;
        }
        for(int l : lost){
            people[l]--;
        }
        for(int r : reserve){
            people[r]++;
        }
        for(int i=1; i<=n; i++){
            if(people[i]==0){
                if(people[i-1]==2){
                    people[i-1]--;
                    people[i]++;
                }
                else if(people[i+1]==2){
                    people[i+1]--;
                    people[i]++;
                }
            }
        }
        for(int i=1; i<=n; i++){
            if(people[i]>=1){
                answer++;
            }
        }
        return answer;
    }
}