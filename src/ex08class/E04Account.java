package ex08class;
/*
시나리오] 은행계좌를 추상화 해보자.
멤버변수 : 예금주
	계좌번호
	잔고
멤버메서드 : 입금하다
	출금하다
	계좌잔고조회
조건1 : 입금은 무제한으로 가능함
조건2 : 잔고가 부족한 경우에는 출금불능 처리
 */	

//은행계좌를 추상화하여 만든 클래스
class Account {
	//멤버변수
	String name;
	//계좌번호는 연산의 대상이 아니므로 String으로 선언한다.
	//String accountNumber;
	/* 만약 계좌번호를 정수형태로 표현하고 싶다면 아래와 같이 long 타입으로 선언하면 된다.
	  이 경우 가독성을 위해 숫자 사이에 _(언더바)를 사용하는 것이 허용된다. 
	  단, 정수타입이므로 작성시 "은 제거해야한다. */
	long accountNumber;
	/* 계좌번호나 전화번호같은 데이터를 표현할때는 위와 같이 String 타입이나 long 타입을 통해 표현할 수 있다. 
	 * */
	
	//잔고의 경우 입출금을 위한 연산이 필요하므로 int로 선언한다.
	int balance;
	
	
	public Account() {}
	
	//멤버메서드
	//입금처리 : 매개변수로 전달된 money원 만큼 잔고에 합산한다.
	void deposit(int money) {
		balance += money;
		System.out.println(money+"원이 입금됨");
	}
	//출금처리 
	void withdraw(int money) {
		//출금을 위해 잔고와 출금액을 비교하여 처리한다.
		if(balance >= money) {
			//잔고가 충분하다면 money원 만큼 차감한다.
			balance -= money;
			System.out.println("계좌에서 "+money+"원이 출금"
					+ "됨");
		}
		else {
			//잔고보다 출금액이 크다면 출금할 수 없다.
			System.out.println("잔고부족으로 출금불능");
		}
	}
	//계좌조회 : 예금주와 현재 잔고를 출력한다.
	void showAccount() {
		System.out.println("계좌주:"+ name);
		System.out.println("계좌번호:"+ accountNumber);
		System.out.println("잔고:"+ balance);
	}
	void init(String n, long a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04Account {	
	
	public static void main(String[] args) {
		
		//첫번째 계좌 인스턴스 생성
		Account account = new Account();
		//초기화 메서드를 통해 인스턴스를 초기화
		account.init("장동건", 111_21_8888, 1000);
		//입금과 출금을 진행한 후 계좌정보를 확인한다.
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();
		
		//두번째 계좌 인스턴스 생성
		Account account2 = new Account();
		//멤버변수에 직접 접근하여 인스턴스 멤버변수를 초기화한다.
		account2.name = "정우성";
		account2.accountNumber = 123_45_67890;
		account2.balance = 900000;
		/* 멤버변수를 직접 기술하는 것은 초기화메서드에 비해 불편한 방법이므로 
		  첫번째 방법으로 초기화하는 것이 좋다. */
		account2.showAccount();
	}
}
