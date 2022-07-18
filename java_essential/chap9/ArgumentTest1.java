package chap9;

class Argument {
	public void change(int i, int[] j) {
		i = 20;
		j[3] = 400;
	}

	public void display(int i, int[] j) {
		System.out.println("객체 변수 i의 값 : " + i);
		System.out.print("배열의 값 : ");
		for (int value : j)
			System.out.print(value + " ");
		System.out.println();
	}
}

class ArgumentTest1 {
	public static void main(String[] args) {
		Argument d = new Argument();
		int a = 10;
		int[] b = { 1, 2, 3, 4 };
		System.out.println("첫 번째 display() 메소드 호출");
		d.display(a, b);
		d.change(a, b);
		System.out.println("=============");
		System.out.println("값을 변환한 다음 두 번째 display() 호출");
		d.display(a, b);
	}
}
