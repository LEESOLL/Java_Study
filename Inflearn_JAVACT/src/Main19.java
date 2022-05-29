import java.util.Scanner;

public class Main19 {
	static String solution(String str) {
		str = str.replaceAll("[^0-9]", "");
		return str;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String str = stdin.next();
		System.out.println(Integer.parseInt(solution(str)));
	}
}
