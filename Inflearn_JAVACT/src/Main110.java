import java.util.Scanner;

public class Main110 {
	static int[] solution(String str, char t) {
		int[] answer = new int[str.length()];
		int p = 1000;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==t) {
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		p=1000;
		for(int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i)==t) { 
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char c = sc.next().charAt(0);
		for(int x : solution(input,c))
			System.out.print(x+" ");
	}
}
