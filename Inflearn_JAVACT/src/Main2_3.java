import java.util.Scanner;
	
public class Main2_3 {
	static String solution(int n, int[] a, int[] b) {
		String answer = "";
		for(int i = 0; i < n; i++) {
			if(a[i]==b[i]) answer += "D\n";
			else if(a[i]==1 && b[i]==3) answer+="A\n";
			else if(a[i]==2 && b[i]==1) answer+="A\n";
			else if(a[i]==3 && b[i]==2) answer+="A\n";
			else
				answer+="B\n";
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] A = new int[num];
		int[] B = new int[num];
		for(int i = 0; i < num; i++) 
			A[i] = sc.nextInt();
		for(int i = 0; i < num; i++) 
			B[i] = sc.nextInt();
		System.out.println(solution(num,A,B));
		
	}
}
