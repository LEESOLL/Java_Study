package chap9;

public class ParaPassTest1 {

	public static void main(String[] args) {
		int z = 0;
		max(1, 2, z);
		System.out.println("1 과 2 중 큰값은 : " + z);
		z = max(1, 2);
		System.out.println("1 과 2 중 큰값은 : " + z);
	}

	public static void max(int x, int y, int z) {
		if (x > y)
			z = x;
		else
			z = y;
	}

	public static int max(int x, int y) {
		int z;
		if (x > y)
			z = x;
		else
			z = y;
		return z;
	}

}
