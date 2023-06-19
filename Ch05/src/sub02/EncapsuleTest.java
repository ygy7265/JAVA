package sub02;

/*
 * 날짜 : 2023/06/19
 * 이름 : 윤경엽
 * 내용 : JAVA 캡슐화 실습
 * 
 * 캡슐화(정보은닉, Encapsuleation)
 * -캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성을)은닉하는 특성
 * -클래스의 속성은 반드시 private 선언을 통해 캡슐화
 * -private 속성을 초기화를 위해 생성자(Constructor)정의
 * -은닉된 정보의 안전한 사용을 위해서 getter, setter 제공
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		//캡슐화된 객체 초기화
		Car sonata = new Car("소나타","흰색",0);
		sonata.setName("그랜져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반뗴","검은색",0);
		sonata.setColor("남색");
		avante.speedUp(60);
		avante.speedDown(60);
		avante.show();
			
		Account wr = new Account("국민은행", "101-123-1234","장보고",10000);
		wr.deposit(2000);
		wr.withdraw(10000);
		wr.show();
	}
}
