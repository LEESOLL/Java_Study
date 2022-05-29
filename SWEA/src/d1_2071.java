import java.util.Scanner;
public class d1_2071 {
	static String solution(String s) {
		String answer = "";
		String[] ss = s.split(" ");
		int sum = 0;
		for(int i=0; i<ss.length; i++) {
			sum = sum + Integer.parseInt(ss[i]);
		}
		double avg = sum/10.0;
		answer = String.format("%.0f", avg);
		
		return answer;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
		String[] str = new String[T];
		
		for(int i = 0; i < T; i++) {
			str[i] = sc.nextLine();
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println("#"+(i+1)+" "+solution(str[i]));
		}
	}
}