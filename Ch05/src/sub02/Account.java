package sub02;

public class Account {
	
	private String bank;
	private String id;
	private String name;
	int balance;
	public Account(String bank,String id,String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
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
