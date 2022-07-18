package chap9;

public class ParaPassTest2 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		System.out.println("초기 num1 : " + num1);
		System.out.println("초기 num2 : " + num2);
		System.out.println("===================");
		
		swap(num1, num2);
		
		System.out.println("swap(num1, num2)이후 num1 : " + num1);
		System.out.println("swap(num1, num2)이후 num2 : " + num2);
		System.out.println("===================");
		
		TwoNumber tn = new TwoNumber(num1, num2);
		
		swap(tn);
		
		System.out.println("swap(tn)이후 num1 : " + tn.num1);
		System.out.println("swap(tn)이후 num2 : " + tn.num2);
	}
	
	static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	static void swap(TwoNumber stn) {
		int temp = stn.num1;
		stn.num1 = stn.num2;
		stn.num2 = temp;
	}

}
