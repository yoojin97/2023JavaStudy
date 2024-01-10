package ex12inheritance;
/*
 오버라이딩(Overriding)
 : 클래스가 상속관계에 있을때 하위클래스에서 상위클래스의 멤버메서드와 완전히
 동일한 모양으로 메서드를 재정의 하는 것을 말한다.
 오버로딩과 다른점은 매개변수의 갯수 및 타입, 반환타입 등이 완전히 똑같은 형태로 정의하는 것이다.
 하위클래스에서 오버라이딩한 메서드는 상위클래스의 메서드를 가리게 되므로
 항상 하위 클래스에서 오버라이딩한 메서드가 호출된다.
 */
//부모클래스 : 일반적인 스피커를 추상화한다
class Speaker {
	//멤버변수 : 볼륨을 표현. private으로 선언.
	private int volumnRate;
	/* 멤버변수가 private이므로 외부에서 값을 설정할 수 있도록 setter를 정의*/
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	/**/
	public void showState() {
		System.out.println("스피커의 볼륨크기:"+ volumnRate);
	}
}
//자식클래스 : 스피커의 기능에 베이스가 보강된 스피커를 추상화
class BaseSpeaker extends Speaker {
	//베이스 기능의 확장을 위한 멤버변수와 이를 설정하기 위한 setter 정의
	private int baseRate;
	public void setBase(int bas) {
		baseRate = bas;
	}
	/*
	 @Override : 어노테이션이라 부르고, 오버라이딩된 메서드에 추가하여 
	  			컴파일러에게 알려주는 역할을 한다. 필수사항은 아니므로 생략할 수 있다.
	 */
	@Override
	public void showState() {
		/* super를 통해 부모클래스에 정의된 멤버메서드를 호출한다.
		  특히 오버라이딩 된 메서드를 호출할때 super가 없으면 재귀호출이 되므로 주의해야한다. */
		super.showState();
		System.out.println("베이스의 볼륨크기:"+baseRate);
	}
}

public class E06Overriding {

	public static void main(String[] args) {
		
		//자식 클래스를 통해 인스턴스를 생성한다.
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		/* 자식 인스턴스를 생성했으므로 부모의 멤버와 자식의 멤버 모두 접근할 수 있다. */
		baseSpeaker.setVolumn(10);
		baseSpeaker.setBase(20);
		/* 오버라이딩 된 메서드를 호출하면 자식쪽의 showState()가 호출된다.
		  부모쪽의 메서드는 자식에 의해 가려지게된다. 
		  윈도우 탐색기에서 같은 이름의 파일을 붙여넣기 할때 덮어쓸지 물어보는 것과 동일하다고 생각하면된다. */
		baseSpeaker.showState();//볼륨과 베이스가 출력된다.
		
		System.out.println();
		
		/* 부모클래스의 참조변수로 자식인스턴스를 참조할 수 있다.
		  이것은 상속관계이기 때문에 가능하다. */
		Speaker speaker = new BaseSpeaker();
		/* 단, 부모타입의 변수로 자식 인스턴스를 참조하면 접근할 수 있는 범위가 부모인스턴스 까지로 제한되므로,
		  자식쪽에 정의된 setBase()는 호출할 수 없다. */
		speaker.setVolumn(30);
		//speaker.setBase(40); //에러발생
		/* 접근범위는 앞에서 설명한 바와 같이 부모까지로 제한되지만 오버라이딩 된 메서드가 있다면 자식쪽의 메서드가 호출된다. */
		speaker.showState();
	}

}
