package ex10accessmodifier;

/*
 캡슐화(Encapsulation)
 : 여러가지 업무 로직을 하나로 묶는다는 의마와, 업무의 순서까지 고려한 형태의 로직을
 구성한다는 의미를 가지고있다. 즉 관련있는 로직을 하나로 묶어주는 것을 말한다.
 */

//아래 4가지 업무는 번호 순서대로 진행해야 한다고 가정한다.
class MemberRegist {
	void doMemberRegist() {
		System.out.println("1.회원가입을 진행합니다.");
	}
}
class CongratulationPoint {
	void doCongratulationPoint() {
		System.out.println("3.가입축하 10포인트를 지급합니다.");
	}		
}
class AutoLogin {
	void doAutoLogin() {
		System.out.println("2.자동로그인");
	}		
}
class FirstLoginEvent {
	void doFirstLoginEvent() {
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다. ");
	}		
}
/*
 업무의 순서를 고려하여 관련된 메서드를 하나의 클래스로 정의한다.
 차후에는 별도의 분석 작업없이 해당 클래스의 doProcess() 메서드만 호출하면 업무는 차질없이 진행될 것이다.
 */
class EncapsulLogic {	
	MemberRegist memberRegist = new MemberRegist(); //1.가입
	FirstLoginEvent firstLoginEvent = new FirstLoginEvent(); //2.로그인
	AutoLogin autoLogin = new AutoLogin(); //3.포인트지급
	CongratulationPoint congratulationPoint = new CongratulationPoint();//4.이벤트페이지이동
	
	void doProcess() {
		memberRegist.doMemberRegist();//회원가입
		autoLogin.doAutoLogin();//이벤트페이지이동
		congratulationPoint.doCongratulationPoint();//자동로그인
		firstLoginEvent.doFirstLoginEvent();//축하포인트지급
	}
}

public class E05Encapsulation {
	
	public static void main(String[] args) {
 
		System.out.println("캡슐화 전 코드");
		
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist();
		firstLoginEvent.doFirstLoginEvent();
		congratulationPoint.doCongratulationPoint();
		autoLogin.doAutoLogin();
		
		System.out.println("==============================");
		
		//아래 메서드 호출을 통해 업무를 순서에 맞게 진행할 수 있다.
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogic().doProcess();
	}
}
