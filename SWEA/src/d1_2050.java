import java.util.Scanner;

public class d1_2050 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
						
		String a = stdin.next();
		char[] arr = a.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",(arr[i]-64));
		}
	}
}
