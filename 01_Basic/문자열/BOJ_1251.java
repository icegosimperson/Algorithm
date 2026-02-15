import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

class BOJ_1251{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        LinkedList<String> list = new LinkedList<>();
        for(int i=2; i<input.length(); i++){
            for(int j=1; j<i; j++){
                StringBuilder str1 = new StringBuilder(input.substring(0, j));
                StringBuilder str2 = new StringBuilder(input.substring(j, i));
                StringBuilder str3 = new StringBuilder(input.substring(i));
                String s1 = str1.reverse().toString();
                String s2 = str2.reverse().toString();
                String s3 = str3.reverse().toString();
                list.add(s1 + s2 + s3);
            }
        }
        Collections.sort(list);
        System.out.println(list.pop());
    }
}