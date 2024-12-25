import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int input = Integer.parseInt(br.readLine());  // 입력 문자
            if(input == 0) // 0 입력 시 입력 종료
                break;
            // 0이 아닐 경우 반복문 진행
            else {
                String str = Integer.toString(input); // 입력 문자 정수를 다시 문자열로 변환
                int count = 0; // 안쪽에 count 변수를 선언해줘야 count 값 갱신
                // 대소 비교
                for(int i=0; i<str.length()/2; i++){
                    if (str.charAt(i) == str.charAt((str.length())-1-i))
                        count++;
                }
                if(count==str.length()/2){
                    bw.write("yes" +"\n");
                }
                else
                    bw.write("no" +"\n");
            }
        }


        bw.flush();
        bw.close();
    }
}
