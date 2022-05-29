import java.util.Scanner;

public class Main2_9 {
	static int solution(int num, int[][] pan) {
		int answer = 0;
		int hang=0,yeol=0,lcross=0,rcross=0,max=0;
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) { 
				hang += pan[i][j];
				yeol += pan[j][i];
			}
			if(hang>yeol) {
				if(hang>max)
					max = hang;
			}
			else
				if(yeol>max)
					max = yeol;
		 
			hang = yeol = 0;
		}
		
		for(int i=0; i<num; i++) { 
			lcross += pan[i][i];
			rcross += pan[i][num-i-1];
			
			if(lcross>rcross) {
				if(lcross>max)
					max = lcross;
			}
			else
				if(rcross>max)
					max = rcross;
		}
		answer = max;
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] pan = new int[num][num];
		for(int i=0; i<pan.length; i++) {
			for(int j=0; j<pan[i].length; j++) {
				pan[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(num,pan));
	}
}
