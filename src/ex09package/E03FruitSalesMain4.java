package ex09package;


class FruitSeller4{

	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	//멤버메서드
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

public class FruitBuyer4{

	int myMoney;
	int numOfApple;
	
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -=money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E03FruitSalesMain4 {

	public static void main(String[] args) {
		
		/*
		 생성자를 사용해서 인스턴스를 생성하면 아래와 같이 생성과 동시에 초기화까지 할수있다.
		 따라서 초기화 메서드를 사용하는 것보다 적은 코드로 작성할 수 있는 장점이 있다.
		 */
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); 
		seller2.showSaleResult();
		buyer.showBuyResult();
	}
}
