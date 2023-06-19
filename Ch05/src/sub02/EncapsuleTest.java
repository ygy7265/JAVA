package sub02;

/*
 * ��¥ : 2023/06/19
 * �̸� : ���濱
 * ���� : JAVA ĸ��ȭ �ǽ�
 * 
 * ĸ��ȭ(��������, Encapsuleation)
 * -ĸ��ȭ�� ��ü�� �Ӽ��� �ܺο� �������� ���ϰ� ��ü�� ����(�Ӽ���)�����ϴ� Ư��
 * -Ŭ������ �Ӽ��� �ݵ�� private ������ ���� ĸ��ȭ
 * -private �Ӽ��� �ʱ�ȭ�� ���� ������(Constructor)����
 * -���е� ������ ������ ����� ���ؼ� getter, setter ����
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		//ĸ��ȭ�� ��ü �ʱ�ȭ
		Car sonata = new Car("�ҳ�Ÿ","���",0);
		sonata.setName("�׷���");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("�ƹ݋�","������",0);
		sonata.setColor("����");
		avante.speedUp(60);
		avante.speedDown(60);
		avante.show();
			
		Account wr = new Account("��������", "101-123-1234","�庸��",10000);
		wr.deposit(2000);
		wr.withdraw(10000);
		wr.show();
	}
}
