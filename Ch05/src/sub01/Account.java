package sub01;
/*
 * ��¥ : 2023/06/19
 * �̸� : ���濱
 * ���� : JAVA ĸ��ȭ �ǽ�
 */
public class Account {
	
	
	
	String bank;
	String id;
	String name;
	int balance;
	
	
	//this �� ���������� �����ϱ� ����. �Ű������ȿ� �Ȱ��� �����̸��� ���� this ����ϸ� ���������� �������� ����.
	//�����ʾƵ� this ���ִ°� �������̿ö�.
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("----------------");
		System.out.println("����� : " + this.bank);
		System.out.println("���¹�ȣ : " + this.id);
		System.out.println("�Ա��� : " + this.name);
		System.out.println("�����ܾ� : " + this.balance);
		System.out.println("-------------------");
	}
}
