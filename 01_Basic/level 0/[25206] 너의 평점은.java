import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double sum = 0.0; // 학점 합계 계산
        double scoreNumber = 0.0;

        // 20줄에 거쳐서 수강한 전공과목 과목명, 학점, 등급이 공백 기준으로 구분되어 입력 받음
        for (int j = 0; j < 20; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subject = st.nextToken(); // 과목
            double input = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken(); // 등급
            double score = 0.0;
            
            if (!grade.equals("P")) { // 등급이 'P'가 아닌 경우에만 학점을 계산하여 합산
                
            	switch (grade) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                         score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                }
            	sum +=	(input * score);
            	scoreNumber += input;
               
            }
        }
        bw.write(String.valueOf(sum/scoreNumber));

        br.close();
        bw.flush();
        bw.close();
    }
}
