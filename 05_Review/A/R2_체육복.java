class R2_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n+1];
        for(int l : lost){
            student[l]--;
        }
        for(int r : reserve){
            student[r]++;
        }
        // -인 것들 한두칸 사이에
        for(int i=1; i<=n; i++){
            if(student[i]>0){ // 여벌있는 학생 발견 시
                // 1. 앞 번호에게 줄 수 있음
                if(i>1 && student[i-1]<0){
                    student[i]--;
                    student[i-1]++;
                }
                // 뒷번호에게 줄 수 있음
                else if(i<n && student[i+1]<0){
                    student[i]--;
                    student[i+1]++;
                }
                // 3. 둘다 필요x? 아무것도x
            }
        }
        // 1 ~ n명
        // [1, 2, 3, 4, 5]
        // lost[index]--
        // reverse[index]++
        // student>=0 이상이면 체육복 있음으로 간주
        for(int i=1; i<=n; i++){
            if(student[i]>=0){
                answer++;
            }
        }
        return answer; // 체육수업을 들을 수 있는 학생의 최댓값
    }
}