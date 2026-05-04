import java.util.*;
class PG_17679 {
    public int solution(int m, int n, String[] board) {
        char[][] table = new char[m][n];
        int answer = 0;
        for(int i=0; i<m; i++){
            table[i] = board[i].toCharArray();
        }
        while(true){
            boolean[][] isValid = new boolean[m][n];
            boolean flag = false;
            for(int i=0; i<m-1; i++){
                for(int j=0; j<n-1; j++){
                    char cur = table[i][j];
                    if(cur != '.' && cur == table[i][j+1] && cur == table[i+1][j] && cur == table[i+1][j+1]){
                        isValid[i][j] = isValid[i][j+1] = isValid[i+1][j] = isValid[i+1][j+1] = true;
                        flag = true;
                    }
                }
            }
            if(!flag) break;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(isValid[i][j]){
                        answer++;
                        table[i][j] = '.';
                    }
                }
            }
            for(int j=0; j<n; j++){
                Stack<Character> s = new Stack<>();
                for(int i=0; i<m; i++){
                    if(table[i][j] != '.'){
                        s.push(table[i][j]);
                    }
                }
                for(int i=m-1; i>=0; i--){
                    if(!s.isEmpty()){
                        table[i][j] = s.pop();
                    } else{
                        table[i][j] = '.';
                    }
                }
            }
        }
        return answer;
    }
}