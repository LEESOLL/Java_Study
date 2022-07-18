package chap10;

import java.util.Scanner;

class Ramyon{
	protected String boiled_pot;
	protected String boilwater(String elecpot, String water) {
		System.out.println(elecpot+"에 "+water+"을 넣어 끓인다(Ramyon클래스)");
		return "끓은 물";
	}
	public void cookRamyon(String ramyon, String vegetable, int time) {
		boiled_pot = boilwater("전기냄비","물");
		System.out.println(boiled_pot+"에 "+ramyon+"과 "+vegetable+"를 넣고 "+time+"분간 끓인다(Ramyon클래스)");
	}
}

class RiceRamyon extends Ramyon{
	public void cookRamyon(String ramyon, String vegetable, String rice, int time) {
		boiled_pot = boilwater("전기냄비","물");
		System.out.println(boiled_pot+"에 "+ramyon+"과"+vegetable+"와"+rice+"을 넣고"+time+"분간 끓인다(RiceRamyon클래스)");
		System.out.println("떡라면 요리 완료(RiceRamyon클래스)");
	}
}

class CheeseRamyon extends Ramyon{
	public void cookRamyon(String ramyon, String vegetable, String cheese, int time) {
		boiled_pot = boilwater("전기냄비","물");
		System.out.println(boiled_pot+"에 "+ramyon+"과"+vegetable+"와"+cheese+"을 넣고"+time+"분간 끓인다(CheeseRamyon클래스)");
		System.out.println("치즈라면 요리 완료(CheeseRamyon클래스)");
	}
}

public class CookingRamyon1 {
	public static void main(String args[]) {
		int s;
		do {
			System.out.println("만들고 싶은 요리를 입력하세요(1:일반라면, 2:떡라면, 3:치즈라면, 99:종료) : ");
			Scanner stdin = new Scanner(System.in);
			s = stdin.nextInt();
			if (s==1) {
				Ramyon r = new Ramyon();
				r.cookRamyon("신라면", "파", 5);
			}
			else if (s==2) {
				RiceRamyon rr = new RiceRamyon();
				rr.cookRamyon("안성탕면", "양파", "떡국떡",7);
				rr.cookRamyon("칼국수라면", "쪽파", 4);
			}
			else if (s==3) {
				CheeseRamyon cr = new CheeseRamyon();
				cr.cookRamyon("진라면", "버섯","슬라이스치즈",6);
			}
		}while(s!=99);
	}
}
