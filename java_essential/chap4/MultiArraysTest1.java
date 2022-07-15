package chap4;

import java.util.Random;

public class MultiArraysTest1 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] score = new int[4][4];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = ran.nextInt(10);
			}
		}
		System.out.println("<난수로 생성된 배열>");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=====각 행의 합계를 출력하는 프로그램=====");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.println(i + "행의 합계는 : " + sum);
		}
	}

}
