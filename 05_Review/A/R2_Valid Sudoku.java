class R2_Valid Sudoku {
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
                int nums = ch-'1';
                int boxIndex = (r/3)*3 + (c/3);
                if(rows[r][nums] || cols[c][nums] || boxes[boxIndex][nums]){
                    return false;
                }
                rows[r][nums] = true;
                cols[c][nums] = true;
                boxes[boxIndex][nums] = true;
            }
        }
        return true;
    }
}