package sub01;
/*
 * 날짜 : 2023/06/19
 * 이름 : 윤경엽
 * 내용 : JAVA 캡슐화 실습
 */
public class Account {
	
	
	
	String bank;
	String id;
	String name;
	int balance;
	
	
	//this 는 전역변수를 참조하기 위함. 매개변수안에 똑같은 변수이름이 들어갈시 this 사용하면 전역변수로 스코프가 잡힘.
	//같지않아도 this 써주는게 가독성이올라감.
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("----------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("-------------------");
	}
}
