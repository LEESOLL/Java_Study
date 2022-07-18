package chap9;

public class SumTwoNumber {
	public static void main(String args[]) {
		System.out.println("매개 변수로 받은 두 수의 합은 :"+(args[0]+args[1]));
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("매개 변수로 받은 두 수의 합은: "+(a+b));
	}
}
