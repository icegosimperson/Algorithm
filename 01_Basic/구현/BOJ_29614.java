import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_29614 {
    private static double cal(String input) {
        switch (input) {
            case "A+":
                return 4.5;
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D+":
                return 1.5;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        double sum = 0.0;
        int cnt = 0;
        for(int i=0; i<S.length(); i++){
            String grade;
            if(i+1 < S.length() && S.charAt(i+1)=='+'){
                grade = S.substring(i, i+2);
                i++;
            } else{
                grade = S.substring(i, i+1);
            }
            sum += cal(grade);
            cnt++;
        }
        System.out.printf("%.5f\n", sum/cnt);
    }
}