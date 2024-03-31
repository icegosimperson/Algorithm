import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [][]matrix_arr = new int[9][9]; // 9*9
        int max = 0; // 최대값
        int row=1, column = 1;

        // 행렬 값 입력 받기
        for(int i=1; i<=9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num > max){
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }

        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(row+" "+column));
        bw.flush();
        bw.close();
    }
}
