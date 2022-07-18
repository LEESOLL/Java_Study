package chap7;

public class OddEven extends Odd {
	int sum;
	public int evenSum(int n) {
		for(int i=1; i<=n; i++) {
			if(i%2 == 1)
				continue;
			else
				sum += i ;
		}
	return sum;
	}
}
