class R2_Rotate_Image {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        for(int r=0; r<n; r++){
            for(int c=r+1; c<n; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        for(int r=0; r<n; r++){
            for(int c=0; c<n/2; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][n-1-c];
                matrix[r][n-1-c] = temp;
            }
        }
    }
}