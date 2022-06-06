import java.util.*;

public class Main5_2 {
	static String solution(String s) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : s.toCharArray()) {
			if(x!=')')
				stack.push(x);
			else {
				while(stack.pop()!='(');
			}
		}
		for(char x : stack)
			answer += x;
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}
}
