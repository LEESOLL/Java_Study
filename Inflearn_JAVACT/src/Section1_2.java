import java.util.Scanner;

public class Section1_2 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(x>=65&&x<=90)
				answer += Character.toLowerCase(x);
			else
				answer += Character.toUpperCase(x);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Section1_2 T = new Section1_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
