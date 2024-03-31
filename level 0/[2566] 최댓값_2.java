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
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
               matrix_arr[i][j] = Integer.parseInt(st.nextToken());

            }
          }
        
    	
	    for(int i=0; i<9; i++){
	    	for(int j=0; j<9; j++){
	    	    if(matrix_arr[i][j] > max){
	    	        max = matrix_arr[i][j];
	    	        row = i+1;
	    	        column = j+1;
	    	    }
	    	}
	    }


        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(row+" "+column));
        bw.flush();
        bw.close();
    }
}
