package sub01;

/*
 * ��¥ : 2023/06/19
 * �̸� : ���濱
 * ���� : JAVA ĸ��ȭ �ǽ�
 * 
 * Ŭ������ ��ü
 * -Ŭ������ ��ü�� �����ϴ� ����ü�̰� �Ӽ�(�ʵ�.�������)�� ���(��� �޼���) ���� ����
 * -��ü�� Ŭ������ ���� �ν��Ͻ�, new �������� ����
 */
public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü(Object)����
		Car1 sonata = new Car1();
		
		//��ü(Object) �ʱ�ȭ
		sonata.name  = "�ҳ�Ÿ";
		sonata.color = "���";
		sonata.speed = 0;
		
		//��üȰ��
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		System.out.println("-------------------------");
		Car1 avante = new Car1();
		avante.name = "�ƹ���";
		avante.color = "������";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
	
		
		
		Account kb = new Account();
		kb.bank = "��������";
		kb.id = "101-111-123";
		kb.name = "�庸��";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		Account wr = new Account();
		wr.bank = "�츮����";
		wr.id = "101-11-123";
		wr.name = "������";
		wr.balance = 5000;
		
		wr.deposit(5000);
		wr.withdraw(10000);
		wr.show();
		
		
		
	}
	
}
