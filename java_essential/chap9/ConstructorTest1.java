package chap9;

class Constructor1{
	
	public int a = 3;
	public int b = 5;
	public int c = 7;
	public Constructor1(int a, int b) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
public class ConstructorTest1 {

	public static void main(String[] args) {
		Constructor1 ct = new Constructor1(2,4);
		System.out.println("객체 변수 a : " + ct.a);
		System.out.println("객체 변수 b : " + ct.b);
		System.out.println("객체 변수 c : " + ct.c);
	}

}
