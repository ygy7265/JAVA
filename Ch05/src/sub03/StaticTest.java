package sub03;
/*
 * ��¥ : 2023.06.20
 * �̸� : ���濱
 * ���� : Ŭ���� ����,�޼��� �ǽ��ϱ�
 */
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ν��Ͻ� �������� carŬ������ ���� �������ν��Ͻ��� �����ϱ�����
		Car sonata = new Car("�ҳ�Ÿ","���",10);
		Car avante = new Car("�ƹݶ�","������",20);
		Car grandeur = new Car("�׷���","�����",30);
		
		sonata.show();
		avante.show();
		grandeur.show();
		
		
		//Ŭ������ �����ϸ� static (����) �� ������
		//Ŭ���� ������ ����
		System.out.println("��ü ������ = " + Car.count);
		//Ŭ���� �޼��� ȣ��
		System.out.println("���� ������ = " + Car.getCount());
		
		//�̱��� ��ü �ǽ� ĸ��ȭ�� �ν��Ͻ� �޴¹��
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		int result = c1.plus(1, 2);
		int result2 = c2.minus(1, 2);
		System.out.println(result);
		System.out.println(result2);
	}

}
