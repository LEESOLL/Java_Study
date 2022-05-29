import java.util.Scanner;

public class d3_4406 {
	static String[] solution(int n, String[] arr) {
		String[] answer = new String[n];
		for(int i = 0; i<n; i++) {
			answer[i] = arr[i].replace("a","").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		for(int i=0;i<n;i++) {
			System.out.println("#"+(i+1)+" "+solution(n,arr)[i]);
		}
		
	}
}
