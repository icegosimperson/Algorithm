import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제에서 구하는 것 : 주어진 문장이 Tautogram인지 확인 하는 것
모든 단어가 같은 글자로 시작해야 한다
 */
class BOJ_5698{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine().toLowerCase();
            if(input.equals("*")){  // 반복문 종료 조건 *
                break;
            }
            String[] alphas = input.split(" ");   // 첫단어들만 확인하면 됨 -> 공백 기준 문자열 구분 필요
            char c = alphas[0].charAt(0); // 첫단어의 첫글자
            boolean flag = true; // 같은 글자로 시작하는지 확인하기 위한 변수
            for(int i=1; i<alphas.length; i++){ // 그 다음 원소부터 확인
                if(alphas[i].charAt(0) !=c){ // 첫글자와 다른 경우
                    System.out.println("N"); // N
                    flag = false; // 거짓 처리
                    break;
                }
            }
            if(flag) System.out.println("Y");
        }
    }
}