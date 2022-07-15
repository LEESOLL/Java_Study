package chap4;
import java.util.Scanner;

public class Practice_280p {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] stu_answer = {{1,3,2,4,3,1,4,2,2,1},
				{3,2,4,2,2,1,1,3,4,1},
				{2,4,3,2,1,2,1,3,3,4},
				{2,3,3,1,1,3,2,2,4,4},
				{3,1,1,2,4,1,2,3,1,3}};
		
		System.out.print("정답을 입력하세요(10개) : ");
		
		int[] answer = new int[10];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = sc.nextInt();
		}
		
		for(int i=0; i<stu_answer.length; i++) {
			int count = 0;
			for(int j=0; j<10; j++) {
				if(stu_answer[i][j] == answer[j])
					count++;
			}
			System.out.println("학생 " + (i+1) + "의 점수 : " + count + "점");
		}
	}
}
