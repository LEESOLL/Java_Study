import java.util.Scanner;

public class Main2_1 {
	static void solution(int n, String str) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] ans = new int[num];
		for(int i = 0; i < num; i++) {
			ans[i] = sc.nextInt();
		}
		System.out.print(ans[0]+" ");
		for(int i = 1; i < num; i++) {
			if(ans[i-1]<ans[i])
				System.out.print(ans[i]+" ");
		}
	}
}
