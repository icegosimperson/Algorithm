import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 첫째 줄에 입력 받기
        int count = 1; // 현재 변수가 위치한 층의 값 (초기값)
        int range = 2; // 현재 최소 방 번호
        br.close();

        if(N==1)
            bw.write("1"); 

        else{
            while(range <= N){
                range = range + (6 * count);
                count++;
            }
            bw.write(Integer.toString(count));
        }
        bw.flush();
        bw.close();
        }


    }


