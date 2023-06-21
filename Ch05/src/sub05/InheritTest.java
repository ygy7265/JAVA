package sub05;
/*
 * 날짜 : 2023/06/21
 * 이름 : 윤경엽
 * 내용 : JAVA 상속 실습하기
 * 상속(Inheritance)
 * -기존 클래스와 속성과 기능을 그대로 자식 클래스에게 확장시키는 프로그래밍 문법
 * -공통적인 로직내용을 부모클래스에 두고 자식클래스에서 상속받아 일관된 프로그래밍수행
 * -부모클래스의 속성 접근권한을 protected 로 변경 자식클래스에서는 부모속성을 초기화 한다.
 * 
 */



class Parent{
	private int num1;
	private int num2;
	
	public Parent(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int plus() {
		return num1 + num2;
	}
}
class Child extends Parent{
	private int num3;
	private int num4;
	 //상속받을경우 부모클래스의 매개변수까지 초기화 해주어야함
	public Child(int num1,int num2,int num3,int num4) {
		super(num1,num2);//부모클래스 생성자 호출
		this.num3 = num3;
		this.num4 = num4;
	}
	public int minus() {
		return num3 - num4;
	}
}

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속 객체
		
		Child c1 = new Child(1,2,3,4);
		int rs1 = c1.plus();
		int rs2 = c1.minus();
		
		System.out.println(rs1);
		System.out.println(rs2);
		
		Sedan sedan = new Sedan("소나타","흰색",0,2000);
		sedan.speedUp(80);
		sedan.speedTurbo();
		sedan.show();
		
		Truck bongo = new Truck("봉고","남색",0,0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		StockAccount kb = new StockAccount("kb증권", "101-123", "홍길동", 10000, "삼성전자", 10, 6);
		kb.deposit(100000);
		kb.buy(5, 50000);
		kb.sell(5, 62000);
		kb.show();
	}

}
