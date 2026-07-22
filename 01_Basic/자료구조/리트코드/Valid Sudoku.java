class Valid Sudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char ch = board[r][c];
                if(ch=='.'){
                    continue;
                }
                int num = ch-'1';
                int boxIndex = (r/3)*3 + (c/3);
                if(rows[r][num] || cols[c][num] || boxes[boxIndex][num]){
                    return false;
                }
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }
}
/*
import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char ch = board[r][c];
                if(ch=='.') continue;
                String rowKey = "row" + r + "," + ch;
                String colKey = "col" + c + "," + ch;
                String boxKey = "box" + (r/3) + "," + (c/3) + "=" + ch;
                if(!set.add(rowKey) || !set.add(colKey) || !set.add(boxKey)){
                    return false;
                }
            }
        }
        return true;
    }
}
 */