/*
0 = " "
1 = "#" (벽)

n x n 배열
arr1 = [9, 20, 28, 18, 11]
arr2 = [30, 1, 21, 17, 28]

answer[] = ["#####", "# # #", "### #", "# ##", "#####"]

1. 일단 10진수 -> 2진수 변환 (비트 연산으로 필요 없어짐)
2. arr1[i][j] == 1 | arr2[i][j] ==1 
3. answer[i][j] = "#"
*/

class PG_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            int temp = arr1[i] | arr2[i]; // Integer.toBinaryString(arr1[i] | arr2[i]); 함수 알아두기
            for(int j=n-1; 0<=j; j--){ // j번째 비트만 1인 마스크
                if((temp & (1<<j))>0){  // temp의 j번째 비트가 1인지 확인
                    sb.append("#");
                } else sb.append(" ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}