package ex03Operator;

public class E05ShortCircuitEvaluation {

	public static void main(String[] args) {
		
		/*
		 SCE(Short-Circute Evaluation)
		 : 하나의 조건검사만으로 결과를 알수있는 경우 Java컴파일러는 뒤의 조건을 수행하지 않고
		 건너뛰게된다. 이경우 변수의 값이 변경되는 코드가 있다면 실행되지 않으므로 주의해야한다.
		 */
		int num1=0, num2=0;
		boolean result;
		
		/*
		 논리And의 경우 둘중 하나만 false이면 무조건 false를 반환하므로
		 첫번째 조건이 false이면 두번째 조건은 검사(실행)하지 않는다.
		 */
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+ result);
		//num2는 초기값이 0을 유지하게 된다.
		System.out.println("num1="+ num1 +", num2="+ num2);
		
		/*
		 논리Or의 경우 둘중 하나만 true이면 무조건 true를 반환하므로
		 첫번째 조건이 true1이면 두번째 조건은 검사하지 않는다.
		 */
		result = (num1+=10)<0 || (num2+=10)>0;
		System.out.println("result="+ result);
		/*
		 num2는 여기서도 증가하지 않는다. 따라서 num2가 프로그램의 실행결과에
		 영향을 미칠 수 있다면 주의가 필요하다.
		 */
		System.out.println("num1="+ num1 +", num2="+ num2);
	}

}
