import java.util.Scanner;

class Solution{
	static int solution(int n, int[] na) {
		int answer = 0;
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
		int[] n = new int[T];
		int[][] na = new int[T][];
		for(int i=0; i<T; i++) {
			n[i] = sc.nextInt();
			na = new int[T][n[i]];
			for(int j=0; j<n[i]; j++)
				na[i][j] = sc.nextInt();
		}
		for(int i=0; i<T; i++) {
			for(int j=0; j<n[i]; j++)
				System.out.print(na[i][j]+" ");
		}
				
			
	}
}
		
		