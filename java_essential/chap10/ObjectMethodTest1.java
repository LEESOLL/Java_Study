package chap10;

class AAA{
	public int a;
}

public class ObjectMethodTest1 {

	public static void main(String[] args) {
		AAA aa = new AAA();
		System.out.println(aa); //System.out.println(객체이름) 이 있으면 자동으로 toString() 메소드 호출
		System.out.println(aa.toString()); 
		Integer ii = 99;
		System.out.println(ii);
		System.out.println(ii.toString());
	}

}
