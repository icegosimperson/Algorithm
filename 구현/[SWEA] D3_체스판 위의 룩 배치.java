// 시간복잡도 O(8*8) = O(1)
import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;


class Solution
{
    public static void main(String args[]) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t=1; t<=T; t++) {
            boolean[] row = new boolean[8];
            boolean[] col = new boolean[8];
            int rook = 0;
            boolean check = true;
            for(int i=0; i<8; i++) {
                String input = br.readLine(); // 문자열로 입력 받기 (배열로 입력 받을 필요 없었음)
                for (int j = 0; j < 8; j++) {
                    if (input.charAt(j) == 'O') {
                        rook++;
                        if (row[i] || col[j]) { // 행과 열 간의 룩이 만난다면
                            check = false; // 중복 처리
                        }
                        row[i] = true;
                        col[j] = true;
                    }
                }
            }
            if(check && rook==8){ // 행과 열 간의 중복이 없고 룩의 개수가 8개라면
                System.out.printf("#%d yes\n", t); // yes
            } else System.out.printf("#%d no\n", t); // no
        }

    }
}
