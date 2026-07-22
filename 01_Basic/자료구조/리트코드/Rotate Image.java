class Solution {
    public void rotate(int[][] matrix) { // 90도 회전 = 전치 + 좌우 뒤집기
        int n = matrix.length;
        for(int r=0; r<n; r++){ // 1)전치
            for(int c=r+1; c<n; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        for(int r=0; r<n; r++){ // 2)좌우 뒤집기
            int left=0; int right=n-1;
            while(left<right){
                int temp = matrix[r][left];
                matrix[r][left] = matrix[r][right];
                matrix[r][right] = temp;
                left++;
                right--;
            }
        }
    }
}