import java.util.*;
class 2352_Equal Row and Column Pair {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rowMap = new HashMap<>();
        int cnt=0;
        int n=grid.length;
        for(int i=0; i<n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<n; j++){
                row.add(grid[i][j]);
            }
            rowMap.put(row, rowMap.getOrDefault(row, 0)+1);
        }
        for(int j=0; j<n; j++){
            List<Integer> col = new ArrayList<>();
            for(int i=0; i<n; i++){
                col.add(grid[i][j]);
            }
            if(rowMap.containsKey(col)){
                cnt += rowMap.get(col);
            }
        }
        return cnt;
    }
}