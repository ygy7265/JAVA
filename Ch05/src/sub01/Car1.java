package sub01;
/*
 * ��¥ : 2023/06/19
 * �̸� : ���濱
 * ���� : JAVA ĸ��ȭ �ǽ�
 */
public class Car1 {
	
	
	//�ʵ�(�Ӽ�)
	String name;
	String color;
	int speed;
	
	
	//�޼���(���)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("������ : " + this.name);
		System.out.println("������ : " + this.color);
		System.out.println("����ӵ� : " + this.speed);
	}

}
