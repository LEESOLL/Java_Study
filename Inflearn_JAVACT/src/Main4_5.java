import java.util.*;

public class Main4_5 {
	static int solution(int n, int k, int[] input) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; j++)
				for(int l=j+1; l<n; l++)
					Tset.add(input[i]+input[j]+input[l]);
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			if(cnt == k)
				return x;
		}

					
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] input = new int[n];
		for(int i=0; i<n; i++)
			input[i] = sc.nextInt();
		System.out.println(solution(n,k,input));
	}
}
