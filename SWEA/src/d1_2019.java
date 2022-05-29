import java.util.Scanner;

public class d1_2019 {
	static void solution(int num) {
		int[] answer = new int[num+1];
		for(int i=0; i<=num; i++) {
			answer[i] = (int)Math.pow(2, i);
		}
		for(int i = 0; i<answer.length-1; i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.print(answer[num]);
		
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		
		solution(n);
	}
}
