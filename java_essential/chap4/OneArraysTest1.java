package chap4;
import java.util.Scanner;

public class OneArraysTest1 {

	public static void main(String[] args) {
		int[] inum = {8,7,3,6,9,6,8,7,0,4,1,2};
		Scanner sc = new Scanner(System.in);
		System.out.print("찾고 싶은 값을 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 0; i < inum.length; i++) {
			if(inum[i]==num) {
				count++;
				System.out.print((i+1)+"번 째 값과 일치합니다.");
			}
		}
		if(count>0){
			System.out.println("그 데이터는 "+count+"개 있습니다.");
		}
		else
			System.out.println("그 데이터는 존재하지 않습니다.");
		
	}

}
