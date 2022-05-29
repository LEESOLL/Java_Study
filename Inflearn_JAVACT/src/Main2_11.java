import java.util.Arrays;
import java.util.Scanner;

public class Main2_11 {
	static int solution(int num, int[][] cls) {
		int answer = 0;
		int cnt = 0, max = 0;
		for(int i=0; i<num; i++) {
			cnt = 0;
			for(int j=0; j<num; j++) {
				for(int k = 0; k<5; k++) {
					if(cls[i][k]==cls[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i+1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] cls = new int[num][5];
		for(int i=0; i<num; i++)
			for(int j=0; j<5; j++)
				cls[i][j] = sc.nextInt();
		System.out.println(solution(num,cls));
	}
	
}
