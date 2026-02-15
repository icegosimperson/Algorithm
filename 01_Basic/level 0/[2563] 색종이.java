import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean arr[][] = new boolean[100][100];
        int number = Integer.parseInt(br.readLine());
        int x, y = 0; // 좌표
        int Area = 0; // 총 넓이
        
        // 행렬 값 입력 받기
        for(int i=0; i<number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    if(!arr[j][k]){ // 중복 영역을 처리
                        arr[j][k] = true; // 이미 표시된 영역은 다시 표시 하지 않도록 한다
                        Area++;
                    }
                }
            }
        }
        bw.write(String.valueOf(Area));
        bw.flush();
        bw.close();
        
    }
}
