import java.util.Scanner;

public class d1_2070 {
	static String solution(String str) {
		String answer = "";
		String[] s = str.split(" ");
		if(Integer.parseInt(s[0])>Integer.parseInt(s[1]))
			answer = ">";
		else if(Integer.parseInt(s[0])==Integer.parseInt(s[1]))
			answer = "=";
		else
			answer = "<";
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String[] ss = new String[T];
		for(int i=0; i<T; i++) {
			ss[i] = sc.nextLine();
		}
		for(int i=0; i<T; i++) {
			System.out.println("#"+(i+1)+" "+solution(ss[i]));
		}
	}
}
