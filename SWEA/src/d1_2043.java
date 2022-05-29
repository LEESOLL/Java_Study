import java.util.Scanner;

public class d1_2043 {
	static String solution(String str) {
		String answer = "";
		String[] strarr = str.split(" ");
		int mok = Integer.parseInt(strarr[0])/Integer.parseInt(strarr[1]);
		int na = Integer.parseInt(strarr[0])%Integer.parseInt(strarr[1]);
		
		answer = String.valueOf(mok)+" "+String.valueOf(na);
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String[] num = new String[T];
		for(int i = 0; i < num.length; i++)
			num[i] = sc.nextLine();
		for(int i = 0; i < num.length; i++)
			System.out.println("#"+(i+1)+" "+solution(num[i]));
	}
}


