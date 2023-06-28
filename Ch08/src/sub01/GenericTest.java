package sub01;

/*
 * JAVA ���׸� �ǽ��ϱ�
 * ���׸�(Generic)
 * -Ŭ���� ������ �Ӽ� Ÿ���� �������� �Ϲ�ȭ ��Ű�¹���
 * -���׸��� ������� Ŭ������ ���뼺 �ְ� ���
 */
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple("�ѱ�",3000);
		Banana b= new Banana("�Ϻ�",2000);
		
		FruitBox box = new FruitBox();
		box.setFruit(a);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		System.out.println(appleBox.getFruit());
		
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		System.out.println(bananaBox.getFruit());
	}

}
