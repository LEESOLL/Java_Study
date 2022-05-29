import java.util.Scanner;

public class d1_2056 {
	static String solution(String str) {
		String answer = "";
		String y = str.substring(0, 4);
		String m = str.substring(4,6);
		String d = str.substring(6);
		if(Integer.parseInt(y)==0000)
			answer = "-1";
		else if(Integer.parseInt(m)==00 || Integer.parseInt(m)>12)
			answer = "-1";
		else if(Integer.parseInt(d)==00)
			answer = "-1";
		else if(Integer.parseInt(m)==1 && Integer.parseInt(d)>31)
			answer = "-1";
		else if(Integer.parseInt(m)==2 && Integer.parseInt(d)>28)
			answer = "-1";
		else if(Integer.parseInt(m)==3 && Integer.parseInt(d)>31)
			answer = "-1";
		else if(Integer.parseInt(m)==4 && Integer.parseInt(d)>30)
			answer = "-1";
		else if(Integer.parseInt(m)==5 && Integer.parseInt(d)>31)
			answer = "-1";
		else if(Integer.parseInt(m)==6 && Integer.parseInt(d)>30)
			answer = "-1";
		else if(Integer.parseInt(m)==7 && Integer.parseInt(d)>31)
			answer = "-1";
		else if(Integer.parseInt(m)==8 && Integer.parseInt(d)>31)
			answer = "-1";
		else if(Integer.parseInt(m)==9 && Integer.parseInt(d)>30)
			answer = "-1";
		else if(Integer.parseInt(m)==10 && Integer.parseInt(d)>31)
			answer = "-1";
		else if(Integer.parseInt(m)==11 && Integer.parseInt(d)>30)
			answer = "-1";
		else if(Integer.parseInt(m)==12 && Integer.parseInt(d)>31)
			answer = "-1";
		else
			answer = y+"/"+m+"/"+d;
		
		return answer;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		String[] str=new String[T];

		for(int test_case = 1; test_case <= T; test_case++)
		{
			str[test_case-1]=sc.next();
		}
		for(int i = 1;i<=T;i++) {
			System.out.println("#"+i+" "+solution(str[i-1]));
		}
	}
}

