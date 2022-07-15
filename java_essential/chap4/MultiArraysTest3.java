package chap4;

public class MultiArraysTest3 {

	public static void main(String[] args) {
		int[][][] threeD = new int[3][4][5];
		int i, j, k, count = 1;
		for(i=0; i<threeD.length; i++) {
			for(j=0; j<threeD[i].length; j++) {
				for(k=0; k<threeD[i][j].length; k++) {
					threeD[i][j][k] = count;
					count++;
				}
			}
		}
		System.out.println("=====초기화 된 배열의 출력=====");
		for(i=0; i<threeD.length; i++) {
			System.out.println((i+1)+"번째 2차원 배열");
			for(j=0; j<threeD[i].length; j++) {
				for(int x : threeD[i][j]) {
					System.out.print(x+" ");
				}
				System.out.println();
			}
		}
		System.out.println();
		for(i = 0; i<threeD.length; i++) {
			for(j=0; j<threeD[i].length; j++) {
				for(k=0; k<threeD[i][j].length; k++) {
					System.out.print(threeD[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
