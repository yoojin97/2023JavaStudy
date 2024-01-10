package ex05method;

/*
 지역변수(Local variable)
 -변수는 사용범위(Scope)를 가지고있고, 해당 지역내에서만 사용할수 있다.
 -해당 지역을 벗어나면 즉시 메모리에서 소멸된다.
 -기본자료형은 입구가 하나만 있는 컵과같은 형태이며, '선입후출'의 특성을 가진다.
 또한 stack은 CPU가 메모리의 생성 및 소멸을 주관한다.
 */
public class E06LocalVariable {

	public static void main(String[] args) {
		{
			boolean scope = true;
			
			/*
			 main지역에서 num을 선언하면 그보다 좁은 지역인 if문에서는 같은 이름의 변수를 선언할 수 없다. 
			 큰 지역에서 이미 선언되어 메모리에 상주하고 있기 때문이다.
			 */
			//int num = 9;//아래 코드에서 에러가 발생됨.
			
			/*
			 main보다 좁은 지역인 if문의 블럭을 생성한 후 변수 num을 선언한다.
			 단, if문과 else문은 서로 다른 지역이므로 동일한 이름의 변수를 선언할 수 있다.
			 */
			if(scope) {
				int num = 1;
				num++;
				System.out.println("첫번째 if문 지역:"+ num);
			}
			else {
				int num = 5;
				System.out.println("첫번째 if문의 else지역:"+ num);
			}
			/*
			 if문의 블럭에서 선언된 변수 nmum
			 */
			int num = 100;
			System.out.println("main메소드지역:"+ num);
			
			simpleFunc();
			
			System.out.println("main메소드 끝:"+ num);
		}
	/*&
	 main어세 선언한 변수 num은 메모리에 아직 상주하고 있지만 해다에서드는 크기가 동일한 서로 다른 ㅣㅈ역세
	 정의되ㅓ으ㅕ
	 */
		static void simpleFunc() {
			int num = 1000;
			System.out.println("simple메소드지역:"+ num);
		}
	}

