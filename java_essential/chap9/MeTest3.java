package chap9;

class ClassAA{
	public ClassBB classBB = new ClassBB();
	public void methodA() {
		System.out.println(classBB.getValue());
	}
}

class ClassBB{
	public ClassCC classCC;
	public String getValue() {
		return classCC.getValue();
	}
}

class ClassCC{
	public String value;
	public String getValue() {
		return "ClassCC";
	}
}

public class MeTest3 {

	public static void main(String[] args) {
		ClassAA classAA = new ClassAA();
		classAA.methodA();
	}
	
}
