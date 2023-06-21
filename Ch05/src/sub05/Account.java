package sub05;

public class Account {
	protected String name;
	protected String id;
	protected String bank;
	protected int balance;
	
	public Account(String name,String id, String bank,int balance) {
		this.name = name;
		this.id = id;
		this.bank = bank;
		this.balance = balance;
	}
	public void deposit(int deposit) {
		this.balance += deposit;
	}
	public void withdraw(int balance) {
		this.balance -= balance;
	}
	
	public void show() {
		System.out.println("--------------------");
		System.out.println("¿Ã∏ß = " + name);
		System.out.println("id = " + id);
		System.out.println("bank = " + bank);
		System.out.println("balance = " + balance);
	}
	
}
