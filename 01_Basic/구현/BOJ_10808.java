import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_10808{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] arr = new int[26];

        for(int i=0; i<input.length(); i++){
            arr[input.charAt(i)-97]++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}