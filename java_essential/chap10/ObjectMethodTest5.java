package chap10;

class Box12{
	
	public int width;
	public int height;
	public int depth;
	
	public Box12(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	public boolean equals(Box12 box12) { // equals()메소드 재정의(overriding)
		return(this.width == box12.width && this.height == box12.height && this.depth == box12.depth);
	} //두 객체가 논리적으로 같은지 비교
}

public class ObjectMethodTest5 {
	public static void main(String args[]) {
		Box12 b1 = new Box12(10,20,30);
		Box12 b2 = new Box12(10,20,30);
		Box12 b3 = b2;
		System.out.println(b1.equals(b2)?"b1과 b2는 논리적으로 같다":"b1과 b2는 논리적으로 같지 않다");
		System.out.println(b1==b2?"b1과 b2는 물리적으로 같다":"b1과 b2는 물리적으로 같지 않다");
		System.out.println(b2.equals(b3)?"b2과 b3는 논리적으로 같다":"b2과 b3는 논리적으로 같지 않다");
		System.out.println(b2==b3?"b2과 b3는 물리적으로 같다":"b2과 b3는 물리적으로 같지 않다");
	}
}
