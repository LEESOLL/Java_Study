import java.util.*;

public class Main4_4 {
	static int solution(String S, String T) {
		int answer = 0;
		String k = "";
		int lt = 0;
		HashMap<Character,Integer> HM = new HashMap<>();
		HashMap<Character,Integer> HM2 = new HashMap<>();
		for(char x : T.toCharArray())
			HM.put(x, HM.getOrDefault(x,0)+1);//T의 해쉬맵 생성
		
		for(int i=0; i<T.length()-1; i++)
			HM2.put(S.charAt(i), HM2.getOrDefault(S.charAt(i), 0)+1);
			
		for(int rt = T.length()-1; rt<S.length(); rt++) { 
			HM2.put(S.charAt(rt), HM2.getOrDefault(S.charAt(rt),0)+1);
			if(HM.equals(HM2))
				answer++;
			HM2.put(S.charAt(lt), HM2.get(S.charAt(lt))-1);
			if(HM2.get(S.charAt(lt))==0)
					HM2.remove(S.charAt(lt));
			lt++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		System.out.println(solution(S,T));
	}
}
