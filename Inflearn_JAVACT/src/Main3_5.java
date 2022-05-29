import java.util.*;

public class Main3_5 {
	static int solution(int n) {
		int answer = 0;
		int lt =0,sum=0, rt;
		int[] arr = new int[n/2+1];
		for(int i=0; i<n/2+1;i++) {
			arr[i]=i+1;
		}
		for(rt=0; rt<n/2+1; rt++) {
			sum += arr[rt];
			if(sum==n) answer++;
			while(sum>=n) {
				sum -= arr[lt++];
				if(sum==n)
					answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

}
