import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // XOR 연산? 하기
        // 모든 숫자가 같도록 최소 횟수를 구하기
        // 어떻게 해야할까?
        int zeroCnt = 0; // 연속으로 0인 그룹의 개수
        int oneCnt = 0; // 연속으로 1인 그룹의 개수
        if(input.charAt(0)=='0'){
            zeroCnt++;
        } else oneCnt++;

        for(int i=1; i<input.length(); i++){
            if (input.charAt(i - 1) != input.charAt(i)) {
                if(input.charAt(i)=='0'){
                    zeroCnt++;
                } else oneCnt++;
            }
        }
        System.out.println(Math.min(zeroCnt, oneCnt));
    }
}
