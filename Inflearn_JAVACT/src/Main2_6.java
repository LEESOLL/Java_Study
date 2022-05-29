import java.util.Scanner;

public class Main2_6 {
	static void solution(int n, String[] nn) {
		int[] nnti = new int[n];
		for(int i=0; i<n; i++) {
			nn[i] = new StringBuilder(nn[i]).reverse().toString();
			nnti[i] = Integer.parseInt(nn[i]);
		}
		int j;
		for(int i = 0; i<n; i++) {
			for(j=2; j<=nnti[i]; j++) {
				if(nnti[i]%j == 0)
					break;
			}
			if(j == nnti[i])
				System.out.print(nnti[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] input = new String[num];
		for(int i=0; i<num; i++)
			input[i] = sc.next();
		
		solution(num,input);
	}
}
