import java.util.Scanner;

public class d1_1936 {
	static String solution(String str) {
		String answer = "";
		if(str.charAt(0)=='1' && str.charAt(2)=='2')
			answer = "B";
		else if(str.charAt(0)=='1' && str.charAt(2)=='3')
			answer = "A";
		else if(str.charAt(0)=='2' && str.charAt(2)=='1')
			answer = "A";
		else if(str.charAt(0)=='2' && str.charAt(2)=='3')
			answer = "B";
		else if(str.charAt(0)=='3' && str.charAt(2)=='1')
			answer = "B";
		else 
			answer = "A";
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String s = stdin.nextLine();
		System.out.println(solution(s));
	}
	
}
