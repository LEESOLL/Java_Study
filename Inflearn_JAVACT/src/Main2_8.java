import java.util.Scanner;
import java.util.Arrays;

public class Main2_8 {
	static int[] solution(int num, int[] score) {
		int[] answer = new int[num];
		int[] score2 = new int[num];
		for(int i=0; i<num; i++)
			score2[i] = score[i];
		Arrays.sort(score2);
		for(int i=0; i<num;i++) { 
			for(int j=0; j<num; j++) { 
				if(score[i] == score2[j])
					answer[i] = num - j;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] score = new int[num];
		for(int i=0; i<num; i++)
			score[i] = sc.nextInt();
		for(int x:solution(num,score))
			System.out.print(x+" ");

	}
}
