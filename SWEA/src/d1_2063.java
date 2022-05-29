import java.util.Scanner;
import java.util.Arrays;

public class d1_2063 {
	static int solution(String str) {
		int answer = 0;
		String[] strarr = str.split(" ");
		int[] strin = new int[strarr.length];
		for(int i=0; i<strin.length; i++) {
			strin[i] = Integer.parseInt(strarr[i]);
		}
		Arrays.sort(strin);
		
		answer = strin[strin.length/2];
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String ss = sc.nextLine();
			System.out.println(solution(ss));
	}
}
