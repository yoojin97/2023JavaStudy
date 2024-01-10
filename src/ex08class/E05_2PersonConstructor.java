package ex08class;

public class E05_2PersonConstructor {

	public static void main(String[] args) {
		
		//기본생성자를 통해 인스턴스를 생성한다.
		PersonConstructor person1  = new PersonConstructor();
		System.out.println("[멤버변수 초기화용 메소드 호출전]");
		//"이름없음"으로 출력된다.
		person1.showPersonInfo();
		
		System.out.println("[멤버변수 초기화용 메소드 호출후]");
		//기존에 생성된 person1을 초기화 메서드를 호출하여 값을 변경한다.
		person1.initialize("홍길동", 20, "논현동");
		person1.showPersonInfo();
		
		/* 인스턴스 생성시 초기화 메서드를 사용하면 생성과 초기화를 별도로 진행해야한다. 
		  하지만 생성자를 사용하면 생성과 동시에 초기화를 진행할 수 있으므로 훨씬 편리하다. */
		System.out.println("[이름만 전달한 값으로 초기화하기]");
		/* 생성자 오버로딩에 의해 정의된 각각의 생성자를 통해
		  인스턴스 생성 및 초기화를 한번에 진행한다. */
		PersonConstructor person2 = new PersonConstructor("박길동");
		person2.showPersonInfo();
		
		System.out.println("[이름과 나이만 전달한 값으로 초기화하기]");
		PersonConstructor person3 = new PersonConstructor("최길동", 40);
		person3.showPersonInfo();
		
		System.out.println("[모든 매개변수를 전달한 값으로 초기화하기]");
		PersonConstructor person4 = new PersonConstructor("박길동", 50, "가산동");
		person4.showPersonInfo();
	}	
}
