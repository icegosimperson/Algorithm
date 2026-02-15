import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10];
		boolean bl;
		int count = 0;
		
        for (int i = 0; i <arr.length; i++) {
           arr[i] = Integer.parseInt(br.readLine())%42;
        }
		
		for (int i=0; i<10; i++) {
			bl = false; 
			for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    bl = true;
                    break;
                }
            }
            if (!bl) {
                count++;
            }
        }
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
