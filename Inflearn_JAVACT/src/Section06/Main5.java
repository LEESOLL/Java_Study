package Section06;
import java.util.*;

public class Main5 {
	static char solution(int n, int[] arr) {
		char answer = 'U';
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1])
				return 'D';
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n,arr));
	}
}
