package ex10accessmodifier.sub;

/*E01AccessModifier1  클래스와 모든 내용이 동일하고 선언된  */
class DefaultClass2 {
	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");
	}
	
}
public class E01AccessModifier2 {
	
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 400;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultMethod() {
		privateVar = 500;
		System.out.println("defaultMethod() 메소드 호출");
	}
	public void publicMethod() {
		privateVar = 600;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
}