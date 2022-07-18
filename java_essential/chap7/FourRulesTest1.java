package chap7;

class MultiDiv extends PlusMinus{
	int multi;
	double div;
	
	public String multi(int x, int y) {
		multi = x * y;
		return "두 수의 곱은 " + multi;
	}
	
	public String div(int x, int y) {
		div = (double)x / y;
		return "두 수의 나눈 값은" + div;
	}
}

public class FourRulesTest1 {

	public static void main(String[] args) {
		String plus, minus, multi, div;
		MultiDiv ob1 = new MultiDiv();
		
		plus = ob1.plus(50, 30);
		minus = ob1.minus(50, 30);
		multi = ob1.multi(50, 30);
		div = ob1.div(50, 30);
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multi);
		System.out.println(div);
	}

}
