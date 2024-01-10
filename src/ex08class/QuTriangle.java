package ex08class;
	
	//밑변을 설정
	void setBottom(int w) {
		this.width = w;
	}
	//높이를 설정
	void setHeight(int h) {
		height = h;
	}
}

public class QuTriangle {

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}

}
