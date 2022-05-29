import java.util.Scanner;

public class d1_2058 {
	static int solution(String str) {
		int answer = 0;
		String[] ss = str.split("");
		for(int i=0;i<str.length();i++) {
			answer += Integer.parseInt(ss[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		System.out.println(solution(s));
	}
}
