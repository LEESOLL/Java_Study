import java.util.*;

public class Main18 {
	static String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(str).reverse().toString();
		if(!str.equals(tmp))
			answer = "NO";
		return answer;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String str = stdin.nextLine();
		System.out.println(solution(str));
	}
}
