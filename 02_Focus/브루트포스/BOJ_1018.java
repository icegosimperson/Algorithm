import java.io.*;
import java.util.*;

public class Main {
    public static int getMinCost(int startRow, int startCol, String[] matrix){
        String[] board = {"WBWBWBWB", "BWBWBWBW"}; // 화이트 시작 체크 보드, 블랙 시작 체크 보드
        int whiteVerCount = 0; // 화이트 시작 체크보드 기준, 다시 색칠해야 하는 비용 계산
        
        for(int i=0; i<8; i++){
            int row = startRow + i;
            for(int j=0; j<8; j++){
                int col = startCol + j;
                
                if(matrix[row].charAt(col) != board[i%2].charAt(j)){ // 홀짝
                    whiteVerCount++;
                }
            }
        }
        return Math.min(whiteVerCount, 64-whiteVerCount); // 화이트 버전과 블랙 버전 중 작은 값 반환
    }
                                 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        String[] matrix = new String[N]; // 문자열 배열로 선언
  
        // M x N 크기 보드 입력 받음
        for(int i=0; i<N; i++){
            matrix[i] = br.readLine(); 
        }
        br.close(); // 입력 종료
        
        int count = Integer.MAX_VALUE; // 이렇게 하는 이유 : 
        
        // 8 x 8 체크보드를 만드는게 목표임으로
        for (int i=0; i<=N-8; i++){
            for(int j=0; j<=M-8; j++){
                int resultCount = getMinCost(i, j, matrix);
                
                if (count > resultCount){
                    count = resultCount;
                }
            }
        }
        bw.write(count + "\n"); // 최종 출력
        bw.flush();
        bw.close();

    }
    
}
