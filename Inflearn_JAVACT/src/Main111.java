import java.util.Scanner;

public class Main111 {
	static String solution(String str) {
		String answer ="";
		str = str+" ";
		char t = str.charAt(0);
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(t==str.charAt(i))
				count ++;
			else {
				if(count == 1)
					System.out.print(t);
				else
					System.out.print(t+String.valueOf(count));
				t = str.charAt(i);
				count = 1;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}
}
