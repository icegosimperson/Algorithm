/*
입력을 어떻게 받는지
출근시간, 퇴근 시간 : 공백으로 구분 
HH:MM 형태 문자열로 입력 받기 -> (:으로 구분)

배열로 구분 해야하나?X -> 문자열로 구분 
문자열? 문자?

퇴근시간 - 출근시간 = * 60분 출력
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int total = 0;
        
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            String start = st.nextToken();
            String end = st.nextToken();

            int startM = convert(start); 
            int endM = convert(end);
            total += (endM - startM);
        }
        System.out.println(total);
    }
    public static int convert (String time){ // HH:MM 변환
        StringTokenizer st = new StringTokenizer(time, ":");
        int HH = Integer.parseInt(st.nextToken());
        int MM = Integer.parseInt(st.nextToken());
        
        return HH*60 + MM;
    }
}
