import java.util.Scanner;
public class d1_1938 {
	static void solution(String str) {
		String[] s = str.split(" ");
		System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])-Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])*Integer.parseInt(s[1]));
		System.out.println(Integer.parseInt(s[0])/Integer.parseInt(s[1]));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		solution(num);
	}
}
