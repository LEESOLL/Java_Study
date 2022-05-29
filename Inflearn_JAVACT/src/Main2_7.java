import java.util.Scanner;

public class Main2_7 {
	static int solution(int n, int[] ans) {
		int answer = 0;
		int count = 0;
		for(int i=0; i<n; i++) {
			if(ans[i]==1) {
				count++;
				answer+=count;
			}
			else
				count = 0;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] ans = new int[num];
		for(int i=0; i<num; i++) 
			ans[i] = sc.nextInt();
		System.out.println(solution(num,ans));
	}
}
