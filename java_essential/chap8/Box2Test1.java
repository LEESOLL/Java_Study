package chap8;

class Box2{
	int width = 10;
	int height = 20;
	int depth = 30;
}

public class Box2Test1 {
	public static void main(String args[]) {
		int myint1 = 100;
		int myint2 = myint1;
		System.out.println("첫 번째 값 : " + myint1 + " 두 번째 값 : " + myint2);
		myint1=200;
		System.out.println("첫 번째 값 : " + myint1 + " 두 번째 값 : " + myint2);//기본참조형은 값 자체가 저장돼서 각각 변경됨
		
		Box2 mybox1 = new Box2();
		Box2 mybox2 = new Box2();
		mybox1.width = 20;
		mybox2.depth = 123;
		System.out.println("mybox1.width :" + mybox1.width);
		System.out.println("mybox1.height : " + mybox1.height);
		System.out.println("mybox1.depth : " + mybox1.depth);
		
		System.out.println("mybox2.width :" + mybox2.width);
		System.out.println("mybox2.height : " + mybox2.height);
		System.out.println("mybox2.depth : " + mybox2.depth);
		
		Box2 mybox3 = mybox2;
		mybox3.width = 1000;
		mybox3.height = 2000;
		System.out.println("mybox2.width : "+ mybox2.width);
		System.out.println("mybox2.height : "+ mybox3.height);
		System.out.println("mybox2.depth : "+ mybox2.depth);
		
	}
}
