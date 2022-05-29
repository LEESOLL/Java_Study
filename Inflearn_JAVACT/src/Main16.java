import java.util.Scanner;

public class Main16 {
	public String solution(String str) {
		String answer = "";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(i==str.indexOf(str.charAt(i)))
				answer = answer+str.charAt(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main16 T = new Main16();
		Scanner stdin = new Scanner(System.in);
		String str = stdin.next();
		System.out.println(T.solution(str));
	}
}
