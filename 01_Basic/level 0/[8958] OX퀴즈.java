import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<N; i++) {
			int count=0;
			int score=0;
			String input = br.readLine();

			for(int j=0; j<input.length(); j++) {
				if(input.charAt(j)=='O') {
					count++;
					score +=count;
				} 
				else 
					count=0;
			}
			bw.write(score+"\n");
		}
		

		bw.flush();
		bw.close();
	}
}
