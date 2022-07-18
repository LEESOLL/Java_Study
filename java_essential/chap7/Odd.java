package chap7;

public class Odd {
	int n,sum;
	public int oddSum(int n) {
		for(int i=1; i<=n; i++) {
			if(i%2==0)
				continue;
			else
				sum += i ;
		}
		return sum;
	}
}
