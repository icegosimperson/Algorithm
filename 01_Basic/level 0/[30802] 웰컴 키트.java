import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizes[] = new int[6];

        int N = sc.nextInt(); // 참가자의 수

        for(int i=0; i<sizes.length; i++){
            sizes[i] = sc.nextInt();
        }

        int T = sc.nextInt(); // 여기 입력한 T랑
        int P = sc.nextInt();

        int totalT = 0;
        for(int i=0; i<sizes.length; i++){
            totalT += (sizes[i] + T -1)/T;
        }

        System.out.println(totalT);
        System.out.print(N/P + " ");
        System.out.print(N%P);


        sc.close();
    }
}

