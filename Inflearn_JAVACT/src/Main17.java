import java.util.Scanner;

public class Main17 {
	static String solution(String str) {
		String answer = "";
		str = str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			aa:if(str.charAt(i)==str.charAt(str.length()-i-1))
				answer="YES";
			else {
				answer = "NO";
				break aa;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String str= stdin.next();
		System.out.println(solution(str));
	}
}
