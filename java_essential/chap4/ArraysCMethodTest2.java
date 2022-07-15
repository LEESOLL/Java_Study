package chap4;
import java.util.Arrays;

public class ArraysCMethodTest2 {

	public static void main(String[] args) {
		String[] array1 = {"IMF", "제주도", "자바도사", "한글나라", "Computer", "모카", "JAVA", "인터넷탐색", "초롱초롱", "come", "바람", "스크립터",
						"군고구마", "도서", "their", "country"};
		System.out.println("===== 정렬 전 데이터 =====");
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("===== 정렬 후 데이터 =====");
		System.out.println(Arrays.toString(array1));
		System.out.println("군고구마는 배열의 " + Arrays.binarySearch(array1, "군고구마") + "번째 요소입니다.");
		String[] array2 = array1;
		System.out.println("array1과 array2 는 같은가? : " + Arrays.equals(array1, array2));
		String[] array3 = new String[20];
		System.arraycopy(array2, 0 , array3, 0, array2.length);
		System.out.println("array3의 배열 : " + Arrays.toString(array3));
		
	}

}
