import java.util.Scanner;

public class Main2_4 {
	static int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-2]+answer[i-1];
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int x : solution(num))
			System.out.print(x+" ");
	}
}
