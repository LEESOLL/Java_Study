package chap4;

public class OneArraysTest2 {
	public static void main(String[] args) {
		String[] slist = {"seoul", "daejeon", "daegu", "kwangju", "incheon", "jeju", "busan"};
		
		System.out.print("원래의 배열 : ");
		for(String s : slist)
			System.out.print(s+" ");
		System.out.println();
		for(int i=0; i<slist.length/2; i++) {
			String tmp = slist[i];
			slist[i] = slist[slist.length-1-i];
			slist[slist.length-1-i] = tmp;
		}
		System.out.println("베열의 요소를 역순으로 바꾼 배열 : ");
		for(String s : slist)
			System.out.print(s+" ");
		System.out.println();
	}
}
