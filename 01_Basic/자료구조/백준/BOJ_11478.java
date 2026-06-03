import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class BOJ_11478{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Set<String> set = new HashSet<>();

        for(int i=0; i<input.length(); i++){ // 시작 위치
            for(int j=i+1; j<=input.length(); j++){ // 끝 위치 (substring s[i] ~ s[j-1])
                set.add(input.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}