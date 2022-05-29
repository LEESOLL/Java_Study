import java.util.Scanner;

public class d1_1933 {
	static void solution(int num) {
		for(int i = 1; i<=num; i++) {
			if(num % i == 0)
				System.out.print(i+" ");
			else if(i == num)
				System.out.print(i);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		solution(T);
	}
}
