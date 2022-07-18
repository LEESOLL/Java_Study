package chap7;
import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OddEven ob = new OddEven();
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		System.out.print("짝수의 합 : " + ob.evenSum(n)+"\n");
		System.out.print("홀수의 합 : " + ob.oddSum(n));
		
		
	}

}
