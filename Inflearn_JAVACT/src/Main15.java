import java.util.*;

public class Main15{
	public String solution(String str) {
		String answer = "";
		char[] c = str.toCharArray();
		int lt=0,rt=c.length-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt]))
				lt++;
			else if(!Character.isAlphabetic(c[rt]))
				rt--;
			else {
				char tmp = c[lt];
				c[lt]=c[rt];
				c[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	
	public static void main(String[] args) {
		Main15 T = new Main15();
		Scanner stdin = new Scanner(System.in);
		String str = stdin.next();
		System.out.println(T.solution(str));
	}
}