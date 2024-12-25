import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        S = S.toUpperCase(); 
        int[] charCounts = new int[26]; 
        int maxCount = 0;
        char maxChar = S.charAt(0); 

        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'A';
            charCounts[index]++;
            if (charCounts[index] > maxCount) {
                maxCount = charCounts[index];
                maxChar = S.charAt(i);
            }
        }

        int countMaxChar = 0;
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] == maxCount) {
                countMaxChar++;
            }
        }

        if (countMaxChar > 1) {
            maxChar = '?';
        }

        bw.write(maxChar);
        bw.flush();
        bw.close();
    }
}
