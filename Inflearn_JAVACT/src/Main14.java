import java.util.*;

public class Main14 {
	public ArrayList<String> solution(String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main14 T = new Main14();
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i] = stdin.next();
		}
		for(String x : T.solution(str)) {
			System.out.println(x);
		}
		
	}
}
