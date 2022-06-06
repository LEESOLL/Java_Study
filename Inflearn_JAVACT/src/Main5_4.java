import java.util.*;

public class Main5_4 {
	static int solution(String s) {
		int answer = 0;
		int lt=0,rt=0;
		Stack<Integer> stack = new Stack<>();
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x))
				stack.push(x-48);
			else {
				rt = stack.pop();
				lt = stack.pop();
				if(x=='+')
					stack.push(lt+rt);
				else if(x=='-')
					stack.push(lt-rt);
				else if(x=='*')
					stack.push(lt*rt);
				else
					stack.push(lt/rt);
			}
		}
		
		return stack.get(0);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}
}
