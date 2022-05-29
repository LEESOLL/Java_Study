import java.util.*;

public class Main112 {
	static String solution(int n, String str) {
		String answer = "";
		for(int i=0; i<n; i++) {
			String tmp = str.substring(0,7).replace("#", "1").replace("*","0");
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			str = str.substring(7);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s = sc.next();
		System.out.println(solution(T,s));
	}
}
