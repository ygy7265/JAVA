package sub05;

public class StockAccount extends Account{
	private String stock;
	private int amount;
	private int price;
	public StockAccount(String name,String id,String bank,int balance,String stock,int amount,int price){
		super(name,id,bank,balance);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void sell(int amount,int price) {
		this.amount -= amount;
		this.balance += amount * price;
	}
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price;
		
	}
	public void show() {
		System.out.println("���ǻ� = " + this.bank);
		System.out.println("���¹�ȣ = " + this.id);
		System.out.println("������ = " + this.name);
		System.out.println("�����ܾ� = " + this.balance);
		System.out.println("�ֽ����� = " + this.stock);
		System.out.println("�ֽļ��� = " + this.amount);
		System.out.println("���簡�� = " + this.price);
	}
}
