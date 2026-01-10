/*
[1, 2, 3, 4, 5]
[1, 0, 2, 0, 1] lost + reserve
이웃한 학생만 빌려주기 가능 (!범위) i+1 > 
값 갱신 주의
*/
class PG_42862_R2 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n+1];

        for(int i=1; i<=n; i++){
            student[i] = 1;
        }

        for(int l : lost){
            student[l]--; // student[l] = student[l]--; 문법 오류
        }
        for(int r : reserve){
            student[r]++;
        }

        //[1, 0, 2, 0, 1]
        for(int i=1; i<=n; i++){
            if(student[i]==0){
                if((i-1)>=0 && student[i-1]==2){
                    student[i-1]--;
                    student[i]++;
                } else if((i+1) <=n && student[i+1]==2){
                    student[i+1]--;
                    student[i]++;
                }
            }
        }

        for(int i=1; i<=n; i++){
            if(student[i] >=1) answer++;
        }
        return answer; // 체육수업을 들을 수 있는 학생의 최댓값
    }
}