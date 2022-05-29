import java.util.Scanner;


public class d1_2072 {
	static void oddSum(int[][] a,int b){
		int sum;
		int[] sumarray = new int[a.length];
		for(int i=0;i<a.length;i++) {
			sum=0;
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==1)
					sum += a[i][j];
			}
			sumarray[i]=sum;
		}
		System.out.println(sumarray[b]);
	}
	
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int[][] x = new int [T][10];
		for(int i=0;i<T;i++){
			for(int j=0;j<10;j++)
				x[i][j]=sc.nextInt();
		}
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			System.out.print("#"+test_case+" ");
			oddSum(x,test_case-1);
		}
	}
}
