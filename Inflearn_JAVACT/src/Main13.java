import java.util.Scanner;

public class Main13 {
	public String solution(String str) {
		String answer = "";
		int max = 0;
		String[] s = str.split(" ");//공백을 기준을 단어를 조개서 배열생성
		for(String x : s ) {
			int len = x.length();
			if(len>max) {
				max = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main13 T = new Main13();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
