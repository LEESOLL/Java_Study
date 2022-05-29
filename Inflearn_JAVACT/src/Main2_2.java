import java.util.Scanner;

public class Main2_2 {
	static int solution(int n, int[] arr) {
		int answer = 1;
		int max = arr[0];
		for(int i = 1; i<n ; i++) {
			if(arr[i]>max) {
				max = arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] height = new int[num];
		for(int i = 0; i < num; i++) {
			height[i] = sc.nextInt();
		}
		System.out.println(solution(num,height));
	}
}
