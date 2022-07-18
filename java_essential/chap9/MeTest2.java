package chap9;

public class MeTest2 {

	public static void main(String[] args) {
		int x = 5;
		MeTest2 p = new MeTest2();
		p.doStuff(x);
		System.out.print(" main x = " + x);
	}
	
	void doStuff(int x) {
		System.out.println(" doStuff x = " + ++x);
	}
}
