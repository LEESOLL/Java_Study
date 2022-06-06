import java.util.*;

public class Main5_1 {
	static String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : s.toCharArray()) {
			if(x!='(') {
				if(stack.isEmpty())
					return "NO";
				stack.pop();
			}
			else
				stack.push(x);
		}
		if(!stack.isEmpty())
			return "NO";
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}
}
