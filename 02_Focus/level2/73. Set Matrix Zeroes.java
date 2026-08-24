import java.util.*;
class 73. Set Matrix Zeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[0].length; c++){
                if(matrix[r][c]==0){
                    rows.add(r);
                    cols.add(c);
                }
            }
        }
        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[0].length; c++){
                if(rows.contains(r) || cols.contains(c)){
                    matrix[r][c] = 0;
                }
            }
        }
    }
}