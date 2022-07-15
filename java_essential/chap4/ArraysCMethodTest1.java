package chap4;

import java.util.Arrays;

public class ArraysCMethodTest1 {

	public static void main(String[] args) {
		int[] int1 = {9,1,7,3,5,4,6,2,8,0};
		System.out.println("초기배열 : "+Arrays.toString(int1));
		Arrays.fill(int1, 3, 5, 33);
		System.out.println("fill() 수행 후 : " + Arrays.toString(int1));
		Arrays.sort(int1);
		System.out.println("sort() 수행 후 : " + Arrays.toString(int1));
		System.out.println("33은 배열의 " + Arrays.binarySearch(int1, 33) + "번째 요소");
		int[] int2 = {5,4,3,2,1};
		System.out.println("두 번째 배열 : " + Arrays.toString(int2));
		System.out.println("두 배열이 같은가? " + Arrays.equals(int1, int2));
		
		int[] int3 = new int[5];
		System.arraycopy(int2, 0, int3, 0, 5);
		System.out.println("복사된 배열 : " + Arrays.toString(int3));
	}

}
