import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		while(true) {
			String input = br.readLine(); 
			StringTokenizer st = new StringTokenizer(input);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == 0 && b == 0 && c == 0)
                break;
			
			if(a*a+b*b==c*c)
				bw.write("right\n");
			else if(c*c+b*b==a*a)
				bw.write("right\n");
            else if(a*a+c*c==b*b)
				bw.write("right\n");
            else
				bw.write("wrong\n");
		}
        		
        bw.flush();
		bw.close();
		br.close();
	}
}

