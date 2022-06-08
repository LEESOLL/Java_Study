import java.util.*;

public class Main5_6 {
	static int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 1; i <= n; i++)
			Q.offer(i);
		while (!Q.isEmpty()) {
			for (int i = 1; i < k; i++) //for문이 k-1번 돈다는 뜻
				Q.offer(Q.poll());
			Q.poll();
			if (Q.size() == 1)
				answer = Q.poll();
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(solution(n, k));
	}
}
