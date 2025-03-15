import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_16431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Br = Integer.parseInt(st.nextToken());
        int Bc = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int Dr = Integer.parseInt(st.nextToken());
        int Dc = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int Jr = Integer.parseInt(st.nextToken());
        int Jc = Integer.parseInt(st.nextToken());

        int BMove = Math.max(Math.abs(Br-Jr), Math.abs(Bc-Jc));
        int DMove = Math.abs(Dr-Jr) + Math.abs(Dc-Jc); // 대각선 이동

        if(BMove < DMove){
            System.out.println("bessie");
        } else if(BMove > DMove){
            System.out.println("daisy");
        } else{
            System.out.println("tie");
        }
    }
}