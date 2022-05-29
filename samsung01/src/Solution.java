import java.util.Scanner;

class Solution{
	static int solution(int n, int[] na) {
		int answer = 0;
		na = new int[n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				answer += na[i]%na[j];
			}
		}
		return answer;
	}
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] Tn = new int[T];
		int[][] Tnn = new int[T][Tn.length];
		for(int i=0; i<T; i++) {
			Tn[i] = sc.nextInt();
			for(int j=0; j<Tn.length; j++) {
				Tnn = new int[T][Tn.length];
				Tnn[i][j] = sc.nextInt(); 
			}
		}
		for(int i=0; i<T; i++) {
			System.out.println(solution(Tn[i],Tnn[i]));
		}
	}
}
		
		