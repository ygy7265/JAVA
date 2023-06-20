package sub03;
/*
 * 날짜 : 2023.06.20
 * 이름 : 윤경엽
 * 내용 : 클래스 변수,메서드 실습하기
 */
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인스턴스 변수생성 car클래스로 부터 생성된인스턴스를 참조하기위함
		Car sonata = new Car("소나타","흰색",10);
		Car avante = new Car("아반떼","검은색",20);
		Car grandeur = new Car("그랜져","노랑색",30);
		
		sonata.show();
		avante.show();
		grandeur.show();
		
		
		//클래스를 참조하면 static (정적) 이 들어가야함
		//클래스 변수로 참조
		System.out.println("전체 차량수 = " + Car.count);
		//클래스 메서드 호출
		System.out.println("현재 차량수 = " + Car.getCount());
		
		//싱글톤 객체 실습 캡슐화된 인스턴스 받는방법
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		int result = c1.plus(1, 2);
		int result2 = c2.minus(1, 2);
		System.out.println(result);
		System.out.println(result2);
	}

}
