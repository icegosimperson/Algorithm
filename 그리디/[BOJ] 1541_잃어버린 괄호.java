import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] str = input.split("-"); // - 기준으로 식 분리 => 괄호 연산

        for(int i=0; i<str.length; i++){
            int temp = Sum(str[i]);
            if(i==0) answer += temp;
            else answer -= temp;
        }
        System.out.println(answer);
    }
    private static int Sum(String string){ // 나뉜 그룹의 더하기 연산 수행 함수
        int sum = 0;
        String[] temp = string.split("[+]"); 
        for(int i=0; i<temp.length; i++){
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
