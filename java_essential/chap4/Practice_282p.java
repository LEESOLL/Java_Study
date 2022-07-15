package chap4;
import java.util.Arrays;

public class Practice_282p {

	public static void main(String[] args) {
		String[] colors = {"blue", "red", "green", "yellow", "orange"};
		Arrays.sort(colors);
		System.out.println(Arrays.toString(colors));
		int s1 = Arrays.binarySearch(colors, "orange");
		int s2 = Arrays.binarySearch(colors, "purple");
		System.out.println(s1 + " " + s2);
	}

}
