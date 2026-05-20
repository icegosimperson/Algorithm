
class PG_181904 {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            if(i%m==(c-1)){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}
/*
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        // 시작은 c-1 인덱스부터, 간격은 m글자씩 건너뛰기!
        for (int i = c - 1; i < my_string.length(); i += m) {
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}
*/
/*
class Solution {
    public String solution(String my_string, int m, int c) {
        int rowCount = my_string.length() / m; // 세로 행의 개수 계산
        char[][] grid = new char[rowCount][m];

        // 1. 문자열을 2차원 배열에 순서대로 채우기
        for (int k = 0; k < my_string.length(); k++) {
            int i = k / m; // 행 인덱스
            int j = k % m; // 열 인덱스
            grid[i][j] = my_string.charAt(k);
        }

        // 2. c번째 열(인덱스로는 c-1)만 위에서 아래로 읽기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rowCount; i++) {
            sb.append(grid[i][c - 1]);
        }

        return sb.toString();
    }
}
*/