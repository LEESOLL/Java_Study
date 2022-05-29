import java.util.Scanner;

public class d1_1545 {	
	public static void main(String[] args) {
		int[] s = {5,6,8,9,7};
		int answer = 0;
		int max = 0;
		for(int i=0; i<5; i++)
			if(s[i]>max) {
				max = s[i];
			}
		System.out.println(max);
	}
}
