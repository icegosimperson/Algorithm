import java.util.Scanner;

public class PG_181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();
        for(char c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            } else{
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.print(sb.toString());
    }
}
/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if('a' <= c && c<='z'){
                c -= 32;
            } else{ // A = 65, a = 97
                c += 32;
            }
            answer += c;
        }
        System.out.println(answer);
    }
}
*/