import java.util.*;

public class Main3_3 {
	static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int sum = 0;
		for(int i=0; i<k; i++)
			sum += arr[i]; //크키가 k인 윈도우 생성
		answer = sum;
		for(int i=k; i<n; i++) {
			sum = sum + arr[i]-arr[i-k];
			if(sum>answer)
				answer = sum;
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println(solution(n,k,arr));
	}

}
