import java.util.Scanner;

public class d1_2068 {
	static int solution(String str) {
		int answer = 0;
		String[] s = str.split(" ");
		int max = Integer.parseInt(s[0]);
		for(int i=0; i<10; i++){
			if(Integer.parseInt(s[i])>max)
				max = Integer.parseInt(s[i]);
		}
		answer = max;
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
