package sub01;

/*
 * 날짜 : 2023/06/19
 * 이름 : 윤경엽
 * 내용 : JAVA 캡슐화 실습
 * 
 * 클래스와 객체
 * -클래스는 객체를 생성하는 구조체이고 속성(필드.멤버변수)과 기능(멤버 메서드) 으로 설계
 * -객체는 클래스의 실제 인스턴스, new 연산으로 생상
 */
public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체(Object)생성
		Car1 sonata = new Car1();
		
		//객체(Object) 초기화
		sonata.name  = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		System.out.println("-------------------------");
		Car1 avante = new Car1();
		avante.name = "아반테";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
	
		
		
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "101-111-123";
		kb.name = "장보고";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id = "101-11-123";
		wr.name = "김유신";
		wr.balance = 5000;
		
		wr.deposit(5000);
		wr.withdraw(10000);
		wr.show();
		
		
		
	}
	
}
