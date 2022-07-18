package chap9;

class Overload{
	public void calc() {
		System.out.println("매개 변수가 없습니다.");
	}
	public void calc(int width) {
		System.out.println("정사각형의 넓이 : "+width*width);
	}
	public void calc(int width, int height) {
		System.out.println("직사각형의 넒이 : "+width*height);
	}
	public void calc(int width, int height, int depth) {
		System.out.println("직육면체의 부피 : "+width*height*depth);
	}
}

public class OverloadTest1 {
	public static void main(String args[]) {
		Overload ol = new Overload();
		int input[] = new int[args.length];
		for (int i = 0; i<args.length;i++)
			input[i] = Integer.parseInt(args[i]);
		switch(args.length) {
		case 0:
			ol.calc();
			break;
		case 1:
			ol.calc(input[0]);
			break;
		case 2:
			ol.calc(input[0],input[1]);
			break;
		case 3:
			ol.calc(input[0],input[1],input[2]);
			break;
			default:
				System.out.println("인수의 개수가 많습니다.");
		}
	}
}
