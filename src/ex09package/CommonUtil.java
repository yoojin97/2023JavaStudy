package ex09package;

/*
 임포트 선언부 : 현재 작성중인 클래스에 다른 패키지에 선언된 클래스를 가져다 쓰기 위한 선언으로,
 			사용할 클래스의 위치를 지정하는 것으로 생각하면된다.
 */

/*
 클래스 선언부 : 
 */
public class CommonUtil {
	
	/* 매개변수로 전달된 문자열을 검사하여 숫자가 아닌 문자가 포함된 경우에는 false를 반환하고,
	  모두 숫자인 경우 true를 반환한다. */
	public static boolean isNumber(String strValue) {
		
		/* 만약 전달된 문자열이 빈 문자열이라면 검사할 필요가 없으므로 즉시 false를 반환한다. */
		if(strValue.length()==0)
			return false;
		
		//문자열의 길이만큼 반복한다.
		for(int i=0 ; i<strValue.length(); i++) {
			//각 인덱스에 해당하는 문자의 아스키코드 값을 반환한다.
			int acode = strValue.codePointAt(i);
			/* 아스키코드를 통해 숫자형식인지 확인하고, 만약 범위를 벗어났다면
			  false를 반환한다. 즉 숫자가 아닌 문자인 경우 false를 반환한다. */
			if( !(acode>='0' && acode<='9') ) {
				return false;
			}
		}
		//문자열 전체가 숫자로만 구성되었다면 true를 반환한다.
		return true;
	}
}



/*
패키지 선언부 : 현재 작성하는 클래스의 위치를 결정하기 위한 선언으로 해당 클래스를
			특정 패키지 하위에 묶어서 생성한다는 의미이다.
*/
