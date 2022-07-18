package chap9;

class Box7{
	int width;
	int height;
	int depth;
	public Box7() {
		this(1,1,1);
		System.out.println("매개 변수 없는 생성자 수행");
	}
	public Box7(int width) {
		this(width,1,1);
		System.out.println("매개 변수(1개) 생성자 수행");
	}
	public Box7(int width, int height) {
		this(width,height,1);
		System.out.println("매개 변수(2개) 생성자 수행");
	}
	public Box7(int width, int height, int depth) {
		System.out.println("매개 변수(3개) 생성자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}

public class Box7Test1 {
	public static void main(String args[]) {
		Box7 mybox1 = new Box7();
		int vol = mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("박스의 부피(매개변수없음): "+vol);
		mybox1 = new Box7(10);
		vol = mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("박스의 부피(매개변수1개): "+vol);
		mybox1 = new Box7(10,20);
		vol = mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("박스의 부피(매개변수2개): "+vol);
		mybox1 = new Box7(10,20,30);
		vol = mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("박스의 부피(매개변수3개): "+vol);
	}
}
