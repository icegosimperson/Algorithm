import java.io.*;
import java.util.*;

public class BOJ_12756 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int atkA = Integer.parseInt(st.nextToken());
        int hpA  = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int atkB = Integer.parseInt(st.nextToken());
        int hpB  = Integer.parseInt(st.nextToken());

        // 필요한 라운드 수 (올림 나눗셈)
        int tB = (hpB + atkA - 1) / atkA; // A가 B를 쓰러뜨리는 데 걸리는 라운드
        int tA = (hpA + atkB - 1) / atkB; // B가 A를 쓰러뜨리는 데 걸리는 라운드

        if (tB < tA) {
            System.out.println("PLAYER A");
        } else if (tA < tB) {
            System.out.println("PLAYER B");
        } else {
            System.out.println("DRAW");
        }
    }
}