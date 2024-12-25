import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String sentence = input.trim();
		int count=0;
		
		if(sentence.isEmpty()) 
			System.out.print(count);
		else {
			for(int i=0; i<sentence.length(); i++) {
				if(sentence.charAt(i) ==' ') {
					count++;
				}
			}
			System.out.print(count+1);
		}
	}

}
