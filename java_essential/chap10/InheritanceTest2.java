package chap10;

class B1 {
	public int x = 500;
	public int y = 1000;
}

class B2 extends B1 {
	public String x = "처음 시작하는 자바";
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		B2 b2 = new B2();
		System.out.println("객체 b2에 들어 있는 x,y 값 : " + b2.x + b2.y);
		B1 b1 = new B1();
		System.out.println("객체 b1에 들어 있는 x,y 값 : " + b1.x + b1.y);
	}

}
