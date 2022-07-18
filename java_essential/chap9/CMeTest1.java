package chap9;

class A {
	private static int counter = 0;
	public static int getCount() {
		return counter;
	}
	
	public A() {
		counter++;
	}
}
public class CMeTest1 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		System.out.println(A.getCount());
	}

}
