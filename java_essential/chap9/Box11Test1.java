package chap9;

class Box11{
	private int ivol;
	private double dvol;
	public Box11(int w,int h,int d) {
		volume(w,h,d);
	}
	public Box11(double w,double h,double d) {
		volume(w,h,d);
	}
	private void volume(int w,int h,int d) {
		ivol = w*h*d;
	}
	private void volume(double w, double h, double d) {
		dvol = w*h*d;
	}
	public int get_ivol() {
		return ivol;
	}
	public double get_dvol() {
		return dvol;
	}
}

public class Box11Test1 {
	public static void main(String[] args) {
		Box11 mybox1 = new Box11(10,20,30);
		System.out.println("박스의 부피(정수 매개 변수): "+mybox1.get_ivol());
		mybox1 = new Box11(10.5,20.5,30.5);
		System.out.println("박스의 부피(실수 매개 변수): "+mybox1.get_dvol());
		mybox1 = new Box11(10,20,30.5);
		System.out.println("박스의 부피(정수와 실수 혼합): "+mybox1.get_dvol());
	}
}
