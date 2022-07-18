package chap8;
import java.util.Scanner;

class SimpleCircle{
	static final double PI = 3.14159;
}

public class Practice_369p {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		int n = sc.nextInt();
		System.out.println("원의 반지름은 : " + n);
		System.out.println("원의 넓이는 : " + n*n*SimpleCircle.PI);
		
	}

}
