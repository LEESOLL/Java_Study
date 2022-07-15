package chap4;
import java.util.Arrays;

public class Practice_281p {

	public static void main(String[] args) {
		String[] myString = {"kim", "park", "200", "lee"};
		Arrays.sort(myString);
		for(String s : myString) {
			System.out.print(s);
			System.out.print(" ");
		}
	}

}
