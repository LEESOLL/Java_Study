import java.util.Scanner;

public class d2_1284 {
	static int solution(String str) {
		int answer = 0;
		String[] s = str.split(" ");
		int P = Integer.parseInt(s[0]);
		int Q = Integer.parseInt(s[1]);
		int R = Integer.parseInt(s[2]);
		int S = Integer.parseInt(s[3]);
		int W = Integer.parseInt(s[4]);
		
		int a_price = W*P;
		int b_price = Q;
		if(W>R)
			b_price = Q + (W-R)*S; 
		if(a_price<b_price)
			answer = a_price;
		else
			answer = b_price;
			
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
