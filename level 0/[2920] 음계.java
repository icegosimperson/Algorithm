import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int[] arr = new int[input.length];
		
		for(int i=0; i<input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		boolean ascending = true;
		boolean descending = true;
		
		for(int i=0; i<input.length-1; i++) {
			if(arr[i] < arr[i+1])
				descending = false;
			else if (arr[i] > arr[i+1])
				ascending = false;
		}
		
		if(ascending == true)
			bw.write("ascending");
		else if(descending == true)
			bw.write("descending");
		else
			bw.write("mixed");

		bw.flush();
		bw.close();
	}
}
