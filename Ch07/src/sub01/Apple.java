package sub01;
//�������ʾƵ� ���� Ŭ������ ��ӹ޴´�
public class Apple{
	private String contry;
	private int price;
	
	public Apple(String contry,int price) {
		this.contry = contry;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// hashCode = ��ü�� ������ �ּҰ�
		System.out.println("��ü �ؽð�" + hashCode());
		System.out.println("contry = " + this.contry);
		System.out.println("price = " + this.price);
		return super.toString();
	}
}
