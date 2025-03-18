import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class BOJ_10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // N명의 대회 운영진
        List<Integer> list = new ArrayList<>();
        for(int i=1; ; i++){
            int t = i*(i+1) / 2;
            if(t>1000) break;
            list.add(t);
        }
        while (T-->0){
            int K = Integer.parseInt(br.readLine());
            boolean check = false;

            for(int i=0; i<list.size(); i++){
                for(int j=0; j<list.size(); j++){
                    for(int k=0; k< list.size(); k++){
                        if(list.get(i) + list.get(j) + list.get(k) == K){
                            check = true;
                            break;
                        }
                    }
                    if(check) break;
                }
                if(check) break;
            }
            System.out.println(check ? 1 : 0);
        }
    }
}