import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] matrix_arr = new char[5][15];
        
        // 행렬 값 초기화
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<line.length(); j++){
                matrix_arr[i][j] = line.charAt(j);
            }
        }
        
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(matrix_arr[j][i] != '\0')
                    bw.write(matrix_arr[j][i]);
            }
        }
        
        bw.flush();
        bw.close();
    }
}
